
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
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }

    // In-order traversal
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }

    // post-order traversal
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data+" ");

    }
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
    }
}