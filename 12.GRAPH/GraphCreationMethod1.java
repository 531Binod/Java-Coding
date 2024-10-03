import java.util.ArrayList;
import java.util.Scanner;

public class GraphCreationMethod1 {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }  
    }

    // Create a graph
    public static void CreateGraph(ArrayList<Edge> graph[], int u, int v) {
        // Add edge from u to v and from v to u (for undirected graph)
        graph[u].add(new Edge(u, v));
        graph[v].add(new Edge(v, u));
    }

    public static void main(String[] args) {
        // Scanner to take input
        Scanner sc = new Scanner(System.in);
        
        // Taking input for number of vertices and edges
        System.out.println("Enter number of vertices: ");
        int vert = sc.nextInt();
        System.out.println("Enter number of edges: ");
        int edge = sc.nextInt();
        
        // Create an array of ArrayLists and ArrayList has data type Edge to represent the graph
        ArrayList<Edge> graph[] = new ArrayList[vert];
        
        // Initialize each vertex's adjacency list
        for (int i = 0; i < vert; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        
        // Taking input for edges
        for (int i = 0; i < edge; i++) {
            System.out.println("Enter head of " + (i+1) + " edge: ");
            int u = sc.nextInt();
            System.out.println("Enter tail of " + (i+1) + " edge: ");
            int v = sc.nextInt();
            CreateGraph(graph, u, v);
        }
        
        // Asking for the vertex whose neighbors to display
        System.out.println("Enter the vertex whose neighbors you want to see: ");
        int x = sc.nextInt();
        
        // Display the neighbors of vertex x
        System.out.println("These are the neighbors of vertex " + x + ":");
        for (int i = 0; i < graph[x].size(); i++) {
            Edge e = graph[x].get(i);
            System.out.print(e.dest + " ");
        }
    }
}
