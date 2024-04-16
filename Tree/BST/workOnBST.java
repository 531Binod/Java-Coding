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
    }
}