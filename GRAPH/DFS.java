import java.util.*;

public class DFS {
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

    // Recursive DFS method
    
    public static void DFS(ArrayList<Edge> graph[], int cur, boolean visited[]) {
        // Mark the current vertex as visited
        visited[cur] = true;

        // Print the current vertex
        System.out.print(cur + " ");

        // Recur for all the vertices adjacent to this vertex
        for (int i = 0; i < graph[cur].size(); i++) {
            Edge e = graph[cur].get(i);
            // If the adjacent vertex has not been visited, call DFS for it
            if (!visited[e.dest]) {
                DFS(graph, e.dest, visited);
            }
        }
    }
    

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean visited[]) {
        // Base case: if the current vertex is already visited, return
        if (visited[curr]) {
            return;
        }

        // Print the current vertex and mark it as visited
        System.out.print(curr + " ");
        visited[curr] = true;

        // Recur for all the vertices adjacent to this vertex
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            // Recursively call DFS for the adjacent vertex if not visited
            dfs(graph, e.dest, visited);
        }
    }

    public static void main(String[] args) {
        int vert = 6; // Number of vertices in the graph

        // Declare an array of ArrayLists to represent the adjacency list of the graph
        ArrayList<Edge> graph[] = new ArrayList[vert];

        // Call the method to create the graph
        createGraph(graph);

        // Create a boolean array to keep track of visited vertices
        boolean visited[] = new boolean[vert];

        // Print DFS traversal of the graph starting from vertex 0
        System.out.println("DFS sequence is:");
        //DFS(graph, 0, visited); // Call DFS with the graph, starting vertex, and visited array
        dfs(graph, 0, visited);
    }
}

