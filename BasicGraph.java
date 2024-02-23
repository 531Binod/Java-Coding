import java.util.ArrayList;
import java.util.Scanner;

public class BasicGraph {
    static class  Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }  
    }
    // Create a graph
    /* 
    public static void CreateGraph(ArrayList<Edge> graph[]){//must mention type array i.e ArrayList<Edge>
        //Initially graph contain null value (Not empty). So we can't store in it.
        for(int i=0; i<graph.length ;i++){
            graph[i] = new ArrayList<Edge>();
        }
        // Now graph contained empty arraylist. So, We can add edge.
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));

    }
    */
    public static void CreateGraph(ArrayList<Edge> graph[], int u, int v){//must mention type array i.e ArrayList<Edge>
        //Initially graph contain null value (Not empty). So we can't store in it.
        for(int i=0; i<graph.length ;i++){
            graph[i] = new ArrayList<Edge>();
        }
        // Now graph contained empty arraylist. So, We can add edge.
        graph[u].add(new Edge(u, v));
        graph[v].add(new Edge(v, u));
    }
    
    public static void main(String[] args) {
        /*We have create array whose name is graph and its datatype is Arraylist 
        where arraylist store edge type data
        int arr[] = new int[size]; General form to create array
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of verices: ");
        int vert = sc.nextInt();
        System.out.println("Enter noumber of Edges: ");
        int edge = sc.nextInt();
        System.out.println("Enter vertices whose want neighbour: ");
        int x = sc.nextInt();
    
        ArrayList<Edge> graph[] = new ArrayList[vert];
        for(int i=0; i<edge; i++){
            System.out.println("Enter head of "+ i+1 + "edge ");
            int u = sc.nextInt();
            System.out.println("Enter tail of "+ i+1 + " edge");
            int v = sc.nextInt();
            CreateGraph(graph,u,v);
        }
        
        System.out.println("These are neighbour of "+x);
        for(int i=0; i<graph[x].size(); i++){
            Edge e = graph[x].get(i);
            System.out.print(e.dest+" ");
        }
    }
}
