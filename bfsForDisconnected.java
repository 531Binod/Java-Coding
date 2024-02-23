import java.util.*;
public class bfsForDisconnected {
    static class Edge {
        int src;
        int dest;

        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }  
    }
    public static void createGraph(ArrayList<Edge> []g){
        for(int i=0; i< g.length; i++){
            g[i] = new ArrayList<Edge>();
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
    public static void bfsTraversal(ArrayList<Edge> graph[], int v, boolean[] visited,int start){
        Queue<Integer> q = new LinkedList<>();
        
        q.add(start);
        while (!q.isEmpty()) {
            int cur = q.remove();
            if (visited[cur]== false) {
                System.out.print(cur+" ");
                visited[cur] = true;
                for(int i=0;i<graph[cur].size();i++){
                    Edge e = graph[cur].get(i);
                    q.add(e.dest);
                }
            }
            
        }
    }

    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        boolean []visited = new boolean[v];
        for(int i=0;i<v;i++){
            if(visited[i]==false){
                bfsTraversal(graph, v, visited, i);

            }
        }
        
        
    }
}
