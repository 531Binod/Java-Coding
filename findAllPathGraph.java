import java.util.ArrayList;
// o(v*v)
public class findAllPathGraph {
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge> []g){
        for(int i=0;i<g.length; i++){
            g[i]= new ArrayList<Edge>();
        }
        g[0].add(new Edge(0, 1));
        g[0].add(new Edge(0, 2));

        g[1].add(new Edge(1, 0));
        g[1].add(new Edge(1, 3));

        g[2].add(new Edge(2, 0));
        g[2].add(new Edge(2, 4));

        g[3].add(new Edge(3, 1));
        g[3].add(new Edge(3, 4));
        g[3].add(new Edge(3, 5));

        g[4].add(new Edge(4, 2));
        g[4].add(new Edge(4, 3));
        g[4].add(new Edge(4, 5));

        g[5].add(new Edge(5, 3));
        g[5].add(new Edge(5, 4));
        g[5].add(new Edge(5, 6));

        g[6].add(new Edge(6, 5));
    }

    public static void printAllpath(ArrayList<Edge> []g, boolean []vis,int cur, String path, int tar){
        if(cur == tar){
            System.out.println(path);
            return;
        }
        for(int i=0; i<g[cur].size();i++){
            Edge e = g[cur].get(i);
            if (!vis[e.dest]) { 
                vis[cur] = true;  // not (!vis[e.dest]) prevent node repeation a(cur) to b ,b to a , a to b...
                printAllpath(g, vis, e.dest, path + e.dest, tar);
                vis[cur] = false; // bcz find all possible path another path may contain same vertix
                // if u not use visit arr then node repeation a to b ,b to a , a to b.... 
            }
        }

    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> []graph  = new ArrayList[v];
        createGraph(graph);
        boolean []vis = new boolean[v];
        //dfs(graph,0,vis);
        int src = 0;
        int tar = 5;
        printAllpath(graph, vis, src, "0", tar);
    }
}
