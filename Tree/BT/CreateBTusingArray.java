import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CreateBTusingArray {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // pre-order traversal
    //O(n)
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }

    // In-order traversal
    //O(n)
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }

    // post-order traversal
    //O(n)
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data+" ");

    }

    // Level-order traversal
    //O(n)
    public static void lavelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            // Make current node
            Node curr = queue.remove();
            // This node can be null or not null
            if (curr==null) {
                System.out.println(); // Go to newline

                // Now there can two situation 1. queue empty (last element is null) or (in-between null)
                if (queue.isEmpty()) {
                    break;
                }else{
                    queue.add(null); // When null encounter then add null
                }
            }else{
                System.out.print(curr.data+" ");
                if (curr.left !=null) {
                    queue.add(curr.left); 
                }
                if (curr.right !=null) {
                    queue.add(curr.right);
                    
                }
                
            }
        }

    }

    // Count number of nodes
    //O(n)
    public static int countOfnode(Node root){
        if(root==null){  // Eg. After leaf node root point to null
            return 0;
        }
        int leftNodeCount = countOfnode(root.left);
        int rightNodeCount = countOfnode(root.right);

        return leftNodeCount+rightNodeCount+1;
    }

    // Sum of nodes
    //O(n)
    public static int sumOfnodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum = sumOfnodes(root.left);
        int rightSum = sumOfnodes(root.right);

        return leftSum + rightSum + root.data;
    }

    // Height of tree
    //O(n)
    public static int heightOfTree(Node root){
        if(root==null){
            return 0;
        }
        int heightOfLeftSubtree = heightOfTree(root.left);
        int heightOfRightSubtree = heightOfTree(root.right);

        int treeHeight = Math.max(heightOfLeftSubtree, heightOfRightSubtree) +1;

        return treeHeight;
    }

    // Diameter of tree 
    // It is a maximum number of node between two node

    //Case-1: Maximum number of nodes between two node that contain root node.
    //O(n2) for each n node we calculate height of order n
    public static int getDiameterOfTree(Node root){
        if(root==null){
            return 0;
        }
        // 3 condition
        //LSD = Left subtree diameter
        int LSD = getDiameterOfTree(root.left);
        int RSD = getDiameterOfTree(root.right);
        // RD ; diameter crosses root
        int RD = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        return Math.max(LSD,Math.max(RSD, RD));  // only take two parameter
    }

    // For o(n)
    // If you don't call the height function separarely
    //public static int 
    public static void main(String args[]) {
        // -1 means null value
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        // To verify
        System.out.println(root.left.left.data);

        // 
        System.out.println("THis is pre-order: ");
        preOrder(root);
        System.out.println();

        System.out.println("THis is In-order: ");
        inOrder(root);
        System.out.println();

        System.out.println("THis is post-order: ");
        postOrder(root);
        System.out.println();

        System.out.println("THis is level-order: ");
        lavelOrder(root);
        System.out.println();

        System.out.println("Number of nodes in tree or size of Tree : "+countOfnode(root));

        System.out.println("Sum of nodes: "+ sumOfnodes(root));

        System.out.println("Tree height = height of root is : "+ heightOfTree(root));

        System.out.println("Diameter of tree: "+ getDiameterOfTree(root));

    }
}