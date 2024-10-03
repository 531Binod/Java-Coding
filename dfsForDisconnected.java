
import java.util.ArrayList;

public class dfsForDisconnected{
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
    public static void dfs(ArrayList<Edge> []g, int cur, boolean []vis){
        System.out.print(cur+" ");
        vis[cur] = true;
        for(int i=0; i<g[cur].size();i++){
            Edge e = g[cur].get(i);
            if (vis[e.dest]==false){ // Don't use vis[cur]==false
                dfs(g, e.dest, vis);
            }   
        } 
            
        
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> []graph  = new ArrayList[v];
        createGraph(graph);
        boolean []vis = new boolean[v];
        for(int i=0; i<v; i++){
            if(vis[i]==false){
                dfs(graph,i,vis);
            }
        }
        System.out.println();
        
    }
}
