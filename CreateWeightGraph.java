import java.util.ArrayList;

public class CreateWeightGraph {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;

        }
    }
    public static void createGraph(ArrayList<Edge> []graph){ // must be static
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, -1));
        graph[2].add(new Edge(2, 0, 2));
    }
    
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> []graph = new ArrayList[v];
        createGraph(graph);
        
        // Print all neighbour of vertex 2 along with weight
        System.out.println("These are Neighbour of 2 and its weight");
        for(int i=0; i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest + " Weight "+ e.wt);
        }
    }
}
