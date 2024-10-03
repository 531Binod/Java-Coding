import java.util.*;

public class BFS {
    // Edge class to represent a directed edge between two vertices: src (source) and dest (destination)
    static class Edge {
        int src;
        int dest;

        // Constructor to initialize the source and destination of the edge
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Method to create the graph using an adjacency list representation
    public static void createGraph(ArrayList<Edge> graph[]) {
        // Initialize each index of the graph array to an empty ArrayList
        // Each ArrayList will store the edges for that particular vertex
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to the graph (undirected graph)
        graph[0].add(new Edge(0, 1)); // Vertex 0 is connected to Vertex 1
        graph[0].add(new Edge(0, 2)); // Vertex 0 is connected to Vertex 2

        graph[1].add(new Edge(1, 0)); // Vertex 1 is connected to Vertex 0
        graph[1].add(new Edge(1, 3)); // Vertex 1 is connected to Vertex 3

        graph[2].add(new Edge(2, 0)); // Vertex 2 is connected to Vertex 0
        graph[2].add(new Edge(2, 4)); // Vertex 2 is connected to Vertex 4

        graph[3].add(new Edge(3, 1)); // Vertex 3 is connected to Vertex 1
        graph[3].add(new Edge(3, 4)); // Vertex 3 is connected to Vertex 4
        graph[3].add(new Edge(3, 5)); // Vertex 3 is connected to Vertex 5

        graph[4].add(new Edge(4, 2)); // Vertex 4 is connected to Vertex 2
        graph[4].add(new Edge(4, 3)); // Vertex 4 is connected to Vertex 3
        graph[4].add(new Edge(4, 5)); // Vertex 4 is connected to Vertex 5

        graph[5].add(new Edge(5, 3)); // Vertex 5 is connected to Vertex 3
        graph[5].add(new Edge(5, 4)); // Vertex 5 is connected to Vertex 4
    }

    // BFS traversal method
    public static void BFS(ArrayList<Edge> graph[], int v) {
        // Queue to store the vertices for exploration (FIFO structure)
        Queue<Integer> q = new LinkedList<>();

        // Boolean array to keep track of visited vertices
        boolean visited[] = new boolean[v];

        // Add the starting vertex (vertex 0 in this case) to the queue
        q.add(0);

        // Loop while the queue is not empty
        while (!q.isEmpty()) {
            // Remove the first vertex from the queue for exploration
            int cur = q.remove();

            // Check if the vertex has not been visited yet
            if (!visited[cur]) {
                // Print the current vertex
                System.out.print(cur + " ");

                // Mark the current vertex as visited
                visited[cur] = true;

                // Traverse all the edges of the current vertex
                for (int i = 0; i < graph[cur].size(); i++) {
                    // Get the destination vertex of the current edge
                    Edge e = graph[cur].get(i);

                    // Add the destination vertex to the queue for future exploration
                    q.add(e.dest);
                }
            }
        }
        System.out.println(); // New line after the BFS traversal
    }

    public static void main(String[] args) {
        int vert = 6; // Number of vertices in the graph

        // Declare an array of ArrayLists to represent the adjacency list of the graph
        ArrayList<Edge> graph[] = new ArrayList[vert];

        // Call the method to create the graph
        createGraph(graph);

        // Print BFS traversal of the graph starting from vertex 0
        System.out.println("BFS sequence is:");
        BFS(graph, vert); // Call BFS with the graph and the number of vertices
    }
}
