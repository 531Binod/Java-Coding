import java.util.*;
public class CreateWeightedGraph {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        // Initialize the graph with empty ArrayLists for each vertex
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add weighted edges to the graph
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, -2));

        graph[1].add(new Edge(1, 0, 2));
        graph[1].add(new Edge(1, 3, -1));

        graph[2].add(new Edge(2, 0, -2));
        graph[2].add(new Edge(2, 4, 5));

        graph[3].add(new Edge(3, 1, -1));
        graph[3].add(new Edge(3, 4, 3));
        graph[3].add(new Edge(3, 5, 2));

        graph[4].add(new Edge(4, 2, 5));
        graph[4].add(new Edge(4, 3, 3));
        graph[4].add(new Edge(4, 5, 10));

        graph[5].add(new Edge(5, 3, 2));
        graph[5].add(new Edge(5, 4, 10));
    }

    public static void main(String[] args) {
        int vert = 6;

        // Create an array of ArrayLists to represent the graph
        ArrayList<Edge> graph[] = new ArrayList[vert];

        // Create the graph
        createGraph(graph);
        
        // Input the vertex whose edge weights to sum
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vertex: ");
        int x = sc.nextInt();

        // Sum the weights of edges connected to vertex x
        int sum = 0;
        for (int i = 0; i < graph[x].size(); i++) {
            Edge e = graph[x].get(i);
            sum += e.wt; // Sum the weights, not the destinations
        }

        System.out.println("Total weight of edges connected to vertex " + x + " is: " + sum);
    }
}
