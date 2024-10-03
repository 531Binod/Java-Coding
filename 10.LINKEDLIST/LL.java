public class LL {
    private Node head; // or Node head
    private Node tail;
    int size;
// Constructor, Initialze size of linkedlist
    public LL(){  
        size = 0;// or this.size=0;
    }
// To create LL , use once "class" for LL
    private class Node{
        int val;
        Node next;

        public  Node(int val) {
            this.val = val; 
        }
        /* 
        public Node(int val , Node next){
            this.val = val;
            this.next = next;
        }*/
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
        Node node = new Node(val);
         if(tail == null){
            head = node; // only INsertAtHead(val);
            tail = node; // or tail = head
            size ++;
            return;
         }
        tail.next= node;
        tail = node;
        size +=1;
    }

    public void InsertAtIndex(int val, int index){
        Node temp = new Node(val);
        if(index==0){
            head = temp;
            tail = temp;
            size ++;
            return;
        }
        if (index==size) {
            //InsertAtTail(val);
            if(tail==null){
                head = temp;
                tail = temp;
                size ++;
                return;
            }
            tail.next = temp;
            tail = temp;
            size ++;
        }

        Node curr = head;
        for(int i=0; i< index-1; i++){
            curr = curr.next;
        }
        
        temp.next = curr.next;
        curr.next=temp;
        size++;
    }

    // Deletion at head deleteFirst method
    public void DeleteAtHead(){
       //  int value = head.val;  // head is node but head.value is integer; U can return value
       if(head==null){
        System.out.println("No element, Underflow");
        return;
       }
       size --;
       if(head.next == null){ // if single element
        head= null;
        tail =null;
        return ;
       }
        head = head.next;
    }
    
    public void DeleteAtTail(){
        if (head==null) { // size =0;
            System.out.println("Underflow, No element to delete ");
            return;
        }
        if(head.next == null){  // single element , size =1
            head=null;
            tail = null;
            size --;
            return;
        }
        Node secondLastNode= getNode(size-2);// size-1 last element 0 indexing
        tail = secondLastNode;
        tail.next = null;
        size --;
    }

    public void DeleteAtIndex(int index){
        if(index <0 || index >= size){
            System.out.println("Invalid index ");
            return;
        }
        if(index == 0){
            DeleteAtHead(); // means no need to go for next line bcz of return
            return;
        }
        if (index==size-1) {
            DeleteAtTail(); 
            return;
        }
        Node prev = getNode(index - 1);
        prev.next = prev.next.next;
        size --;
    }

    // Get ith node
    public Node getNode(int index){
        Node temp = head;
        for(int i=0 ; i<index ; i++){
            temp = temp.next;
        }
        return temp;
    }

    // Searching node of element , return node
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

    // Search value return index
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
