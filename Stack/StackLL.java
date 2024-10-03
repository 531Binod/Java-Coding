public class StackLL{
    // Stack Implementation using LinkedList (Easier than Array bcz we need to maintain size)

    // Node structure
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
    public static Node head=null;
    // O(1)  Push
    public void push(int data){
        // Indsert at head
        Node node = new Node(data);
        if(head==null){
            head= node;
            return;
        }
        node.next = head;
        head = node;
    }
    // O(1)  Pop
    public int pop(){
        if(head == null){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }
    // O(1)  isEmpty
    public boolean isEmpty(){
        if(head== null){
            return true;
        }
        return false;
    }
    // O(1) Peek
    public int peek(){
        return head.data;
    }
    // Display
    public static void Display(){
        if (head==null) {
            System.out.println("No element ");
            return;
        }
        while(head.next != null){
            System.out.print(head.data+" <-- ");
            head = head.next;
        }
        System.out.print(head.data + " <-- Null");
    }
    public static void main(String[] args) {
        StackLL stack = new StackLL();
        stack.push(2);
        stack.push(45);
        System.out.println(stack.peek());
        
        Display();

    }
}