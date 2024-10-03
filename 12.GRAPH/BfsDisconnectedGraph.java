import java.util.*;

public class BfsDisconnectedGraph {
    // Edge class to represent an undirected edge between two vertices
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Method to create the graph using an adjacency list representation
    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to create a disconnected graph
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

        // Vertex 5 is disconnected, no edges connected to it
        // graph[5] will remain empty
    }

    // BFS method to traverse the graph
    public static void BFS(ArrayList<Edge> graph[], int start, boolean visited[]) {
        Queue<Integer> q = new LinkedList<>();

        // Add the starting vertex to the queue and mark it as visited
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int curr = q.poll(); // Get the current vertex from the queue
            System.out.print(curr + " "); // Print the current vertex

            // Traverse all adjacent vertices
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (!visited[e.dest]) {
                    q.add(e.dest); // Add adjacent vertex to the queue
                    visited[e.dest] = true; // Mark it as visited
                }
            }
        }
    }

    // Method to perform BFS on a disconnected graph
    public static void BFSDisconnected(ArrayList<Edge> graph[], int vertices) {
        boolean visited[] = new boolean[vertices];

        // Perform BFS for each unvisited vertex (to handle disconnected components)
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                BFS(graph, i, visited); // Call BFS for each disconnected component
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 6;
        ArrayList<Edge> graph[] = new ArrayList[vertices];

        // Create the graph
        createGraph(graph);

        // Perform BFS for the disconnected graph
        System.out.println("BFS traversal of the disconnected graph:");
        BFSDisconnected(graph, vertices);
    }
}
