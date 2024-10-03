import java.util.*;

public class CostOfGraph {
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

    // Method to create the graph
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

    // Method to calculate the total cost of the graph
    public static int calculateGraphCost(ArrayList<Edge> graph[]) {
        int totalCost = 0;
        boolean[][] visited = new boolean[graph.length][graph.length]; // To avoid counting edges twice

        // Traverse each vertex's adjacency list
        for (int i = 0; i < graph.length; i++) {
            for (Edge edge : graph[i]) {
                if (!visited[edge.src][edge.dest]) { // Ensure we don't count the same edge twice
                    totalCost += edge.wt;
                    visited[edge.src][edge.dest] = true;
                    visited[edge.dest][edge.src] = true; // Mark both directions as visited
                }
            }
        }
        return totalCost;
    }

    public static void main(String[] args) {
        int vert = 6;
        ArrayList<Edge> graph[] = new ArrayList[vert];

        // Create the graph
        createGraph(graph);

        // Calculate the total cost of the graph
        int totalCost = calculateGraphCost(graph);

        // Print the result
        System.out.println("Total cost of the graph is: " + totalCost);
    }
}

