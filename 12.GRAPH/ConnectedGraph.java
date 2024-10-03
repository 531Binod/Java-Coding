import java.util.*;

public class ConnectedGraph {
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

        // Add edges to the graph (undirected graph)
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
    }

    // DFS method to traverse the graph
    public static void DFS(ArrayList<Edge> graph[], int curr, boolean visited[]) {
        if(visited[curr]){
            return;
        }
        visited[curr] = true;  // Mark current vertex as visited

        // Traverse all adjacent vertices
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                DFS(graph, e.dest, visited);  // Recur for adjacent vertices
            }
        }
    }

    // Method to check if the graph is connected
    public static boolean isConnected(ArrayList<Edge> graph[], int vertices) {
        boolean visited[] = new boolean[vertices];

        // Perform DFS from vertex 0
        DFS(graph, 0, visited);

        // Check if all vertices were visited
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                return false;  // If any vertex is not visited, the graph is not connected
            }
        }

        return true;  // All vertices are visited, the graph is connected
    }

    public static void main(String[] args) {
        int vertices = 6;
        ArrayList<Edge> graph[] = new ArrayList[vertices];

        // Create the graph
        createGraph(graph);

        // Check if the graph is connected
        if (isConnected(graph, vertices)) {
            System.out.println("The graph is connected.");
        } else {
            System.out.println("The graph is not connected.");
        }
    }
}
