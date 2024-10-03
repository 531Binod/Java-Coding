import java.util.*;

public class ConnectedComponent {

    // Method to create a graph as an adjacency list
    public List<List<Integer>> createGraph(int V, int[][] edges) {
        // Initialize the adjacency list for V vertices
        List<List<Integer>> adjList = new ArrayList<>();
        
        // Create an empty list for each vertex
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        
        // Add edges to the adjacency list
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            
            // Since the graph is undirected, add each vertex to the other's list
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        
        return adjList;
    }

    // DFS method to traverse the graph
    public void dfs(int node, List<List<Integer>> adj, boolean[] visited) {
        // Mark the current node as visited
        visited[node] = true;
        
        // Visit all unvisited neighbors
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited);
            }
        }
    }
    
    // Method to find connected components
    public int connectedComponents(int V, List<List<Integer>> adj) {
        boolean[] visited = new boolean[V];  // To track visited nodes
        int componentCount = 0;  // Count of connected components
        
        // Traverse all vertices
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                componentCount++;  // Increment component count when starting a new DFS
                dfs(i, adj, visited);  // Explore this component using DFS
            }
        }
        
        return componentCount;  // Return the number of connected components
    }

    public static void main(String[] args) {
        // Create an instance of ConnectedComponent
        ConnectedComponent graph = new ConnectedComponent();
        
        // Number of vertices
        int V = 7;
        
        // List of edges (u, v) where there is an edge between u and v
        int[][] edges = {
            {0, 1},
            {1, 2},
            {3, 4},
            {5, 6}
        };
        
        // Step 1: Create the graph
        List<List<Integer>> adjList = graph.createGraph(V, edges);
        
        // Step 2: Find the number of connected components
        int componentCount = graph.connectedComponents(V, adjList);
        
        // Output the result
        System.out.println("Number of connected components: " + componentCount);
    }
}
