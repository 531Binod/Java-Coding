import java.util.ArrayList;

public class workOnBST {

    // Node structure
    static class  Node {
        int data;
        Node left;
        Node right;

        // Constructor
        public Node(int data){
            this.data = data;
        }  
    }
    // Insertion O(H) BST ,  Not O(logn) bcz Skewed BST is also BST which is not O(logn)
    public static Node insertionBST(Node root, int val){
        if(root == null){  // Make first node as root
            root = new Node(val);
        }
        else if (root.data > val) {
            root.left = insertionBST(root.left, val);
        }else{
            root.right = insertionBST(root.right, val);
        }
        return root;

    }
    // To verify BST creation , Use in-order traversal so that should give sorted sequence
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }

    // Search in BST
    public static boolean SearchBST(Node root, int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        else if(root.data> key){
            return SearchBST(root.left, key);
        }else{
            return SearchBST(root.right, key);
        }
    }

    // Deletion BST 
    public static Node deletionBST(Node root, int val){
        if(root.data > val){
            root.left= deletionBST(root.left, val);
        }
        else if(root.data < val){
            root.right= deletionBST(root.right, val);
        }else{
            // Case -1: No child 
            if(root.left == null && root.right==null){
                return null;
            }
            // case -2: Single child
            if(root.left==null){
                return root.right;
            }
            else if (root.right==null) {
                return root.left;
            }
            // Case-3: Having two child
            // In-order successor is the leftmost(lowest value BST) element of right subtree
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;

            root.right = deletionBST(root.right, IS.data);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while (root.left != null) {
            root = root.left;
            
        }
        return root;
    }

    // Prrint in range X=2 & Y=10 in BST
    public static void printInRangeBST(Node root, int x, int y){
        if(root==null){
            return;
        }
        // Case-1:
        if(root.data>=x && root.data <=y){
            printInRangeBST(root.left, x, y);
            System.out.print(root.data + " ");
            printInRangeBST(root.right, x, y);
        }
        // case-2:
        else if(root.data<=x){
            printInRangeBST(root.right, x, y);
        }else{
            printInRangeBST(root.left, x, y);
        }
    }

    // Print all path from root to leaf
    public static void  printAllpath(Node root, ArrayList<Integer> path){
        if (root==null) {
            return ;
        }
        path.add(root.data);
        // case-1 leaf node
        if(root.left==null && root.right==null){
            printPath(path);
        }else{
            printAllpath(root.left, path);
            printAllpath(root.right, path);
        }
        path.remove(path.size()-1);
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size();i++){
            System.out.print(path.get(i)+"-->");
        }
        System.out.println();
    }




    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insertionBST(root, values[i]); // It will return node and consider it as next round
        }
        inOrder(root);
        System.out.println();

        if(SearchBST(root, 8)){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }

        System.out.println("After 3 deletion");
        deletionBST(root, 3);
        inOrder(root);
        System.out.println();

        System.out.println("Print in range4 & 9");
        printInRangeBST(root, 4, 9);

        System.out.println();
        System.out.println("Here are all path");
        printAllpath(root, new ArrayList<>());
    }
}