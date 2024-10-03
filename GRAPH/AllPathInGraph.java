import java.util.*;

public class AllPathInGraph {
    // Edge class to represent a directed edge between two vertices: src (source) and dest (destination)
    static class Edge {
        int src;
        int dest;

        // Constructor to initialize the source and destination of the edge
        public Edge(int s, int d) {
            this.src = s;  // Source vertex
            this.dest = d; // Destination vertex
        }
    }

    // Method to create the graph using an adjacency list representation
    public static void createGraph(ArrayList<Edge> graph[]) {
        // Initialize each index of the graph array to an empty ArrayList
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

    // Method to find all paths from source to target
    public static void findAllPaths(ArrayList<Edge> graph[], int curr, int target, boolean visited[], List<Integer> path) {
        // Mark the current vertex as visited and add it to the path
        visited[curr] = true;
        path.add(curr);

        // If the current vertex is the target, print the path
        if (curr == target) {
            System.out.println(path);
        } else {
            // Recur for all the vertices adjacent to this vertex
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                // If the adjacent vertex has not been visited, call findAllPaths for it
                if (!visited[e.dest]) {
                    findAllPaths(graph, e.dest, target, visited, path);
                }
            }
        }

        // Backtrack: remove the current vertex from the path and mark it as unvisited
        path.remove(path.size() - 1);
        visited[curr] = false;
    }

    public static void main(String[] args) {
        int vert = 6; // Number of vertices in the graph

        // Declare an array of ArrayLists to represent the adjacency list of the graph
        ArrayList<Edge> graph[] = new ArrayList[vert];

        // Call the method to create the graph
        createGraph(graph);

        // Create a boolean array to keep track of visited vertices
        boolean visited[] = new boolean[vert];

        // List to store the current path
        List<Integer> path = new ArrayList<>();

        // Specify the target vertex for which we want to find all paths from vertex 0
        int target = 5;

        // Find all paths from vertex 0 to the target vertex
        System.out.println("All paths from vertex 0 to vertex " + target + ":");
        findAllPaths(graph, 0, target, visited, path);
    }
}
