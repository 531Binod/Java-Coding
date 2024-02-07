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
        /* 
         if(tail = null){
            head = node;
            tail = head;
         }
        */
        if(tail==null){
            INsertAtHead(val);
        }
        Node node = new Node(val);
        tail.next= node;
        tail = node;
        size +=1;
    }

    public void InsertAtIndex(int val, int index){
        Node temp = new Node(val);
        if(index==0){
            head = temp;
            return;
        }
        if (index==size) {
            InsertAtTail(val);
        }

        Node curr = head;
        for(int i=0; i< index-1; i++){
            curr = curr.next;
        }
        
        temp.next = curr.next;
        curr.next=temp;
        size++;
    }

    // Deletion
    public int DeleteAtHead(){
        int value = head.val;  // head is node but head.value is integer;
        head = head.next;
        if (head == null) {  // Single element there
            tail = null ; 
        }
        size --;
        return value;
    }

    public void DeleteAtTail(){
        
        if (size <= 1) {
            head=null;
        }

        //int value = tail.val;
        Node secondLastNode= getNode(size-2);// size-1 last element 0 indexing
        //secondLastNode.next = null;
        tail = secondLastNode;
        tail.next = null;
        size --;
    

    }

    public int DeleteAtIndex(int index){
        if(index == 0){
            return DeleteAtHead(); // means no need to go for next line bcz of return
        }
        if (index==size-1) {
           // return DeleteAtTail(); 
        }

        Node prev = getNode(index - 1);
        int value = prev.next.val;

        prev.next = prev.next.next;
        size --;

        return value;

    }


    public Node getNode(int index){
        Node temp = head;
        for(int i=0 ; i<index ; i++){
            temp = temp.next;
        }
        return temp;
    }

    // Searching node of element
    public Node find(int value){
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // Search value
    public int search(int value){
        Node node = head;
        int count = 0;
        while (node != null) {
            if (node.val == value) {
                return count;
            }
            node = node.next;
            count ++;
        }
        return -1;
    }


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
