import java.util.*;
//Time Complexity: O(n * 2^n) for 2^n subset has to print O(n);
//Space Complexity: O(n)

public class Subset {
    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubset(int n, ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }
        // Add hoga
        subset.add(n);            // Including 'n' in the subset
        findSubset(n-1, subset);  // Not including 'n' in the subset
        // Add nahi hoga
        subset.remove(subset.size() - 1);  // remove added last element
        findSubset(n-1, subset);  // // Proceed with including 'n'
       
    }
    public static void main(String[] args) {
        int n=3;
        findSubset(n,new ArrayList<>());
    }
}
/*

Output: subset 2^n elsment
3 2 1 
3 2 
3 1 
3 
2 1 
2 
1 

*/
