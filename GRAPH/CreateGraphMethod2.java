import java.util.ArrayList;
import java.util.*;
public class CreateGraphMethod2 {
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src  = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        // initial graph array contain null
        for(int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<>();
        }

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

    public static void main(String[] args) {
        int vert = 6;
        // Array declaration
        // int arr[] = new int[size] , similarly we create graph array
        //ArrayList<Edge> graph[] = new ArrayList<Edge>[vert];   wrong
        ArrayList<Edge> graph[] = new ArrayList[vert];

        createGraph(graph);
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter vertices whose neighbour u wants ");
        int x = sc.nextInt();
        System.out.println("Neighbour of "+ x + " are ");
        for(int i=0;i<graph[x].size();i++){
            Edge e = graph[x].get(i);
            System.out.print( e.dest +" ");
        }
    }
}
