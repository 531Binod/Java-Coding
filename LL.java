

public class LL {
    private Node head;
    private Node tail;
    int size;
// Constructor, Initialze size of linkedlist
    public LL(){
        this.size = 0;
    }
// To create LL , use once "class" for LL
    private class Node{
        int val;
        Node next;

        public  Node(int val) {
            this.val = val; 
        }
        public Node(int val , Node next){
            this.val = val;
            this.next = next;
        }
    }
    // Insertion
    public void INsertAtHead(int val){
        Node node = new Node(val); // Node created
        node.next = head;
        head = node;

        if(tail == null){
            tail = head; // tail = head = node from line 28 above
        }
        size +=1;
    }

    public void InsertAtTail(int val){
        if(tail==null){
            INsertAtHead(val);
        }
        Node node = new Node(val);
        tail.next= node;
        tail = node;
        size +=1;
    }

    public void InsertAtIndex(int val, int index){
        
        if(index==0){
            INsertAtHead(val);
        }
        if (index==size) {
            InsertAtTail(val);
        }

        Node temp = head;
        for(int i=1; i< index ; i++){
            temp = temp.next;
        }
        //Node node = new Node(val);
        Node node = new Node(val, temp.next);
        temp.next = node;
        //node.next = 
    }

    // Deletion


    //Display or Traversal
    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    
    
}
