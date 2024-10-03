public class MyLL{
    // Make node structure. I.e  create a class and its constructor
    static Node head; // Make sure head is non-static if the method is non-static. 
                     // but if it is static then effect methodwhether it is static or non-static

    /*
     Use a static inner class (static  class Node) when the inner class doesn't need access to the enclosing class's instance variables or methods.
     Use a non-static inner class when you want the inner class to have access to the instance members of the outer class, as in the 
     case of your linked list. */
    public class Node{
        int data; // Take data type acc to value , for string String data;
        Node next;

        // constructor
        public Node(int data){  // No return type constructor
            this.data = data;
            this.next = null;
        }
    }
    int size;
     public MyLL(){
        size = 0;
    }
    // Addition, First we need to creat node 
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;  //Make sure head is non-static if the method is non-static
        head =newNode;
    }
    
    // addLast O(n)  traversing + insering = O(n) + O(1) == O(n)
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            // newNode.next = head; // bcz we know head is null so No need newNode.next = head;
            head = newNode;  // now head becomes newNode. 
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        //newNode.next = null; // b defult is null bcz it is free
    }

    public void printList(){
        Node curNode = head;
        while (curNode != null) {   // curNode.next != null skip last one
            System.out.print(curNode.data+" --> ");
            curNode = curNode.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args) {
        MyLL list = new MyLL();
        list.addFirst(34);
        list.addFirst(45);

        list.printList();   // why use object list to call printList, bcz printList is not static method. If yoru want 
        System.out.println();                  //make printList as static . then head must be declare as static.then we can simpley call printList();

        list.addLast(900);
        list.addLast(600);

        list.printList();
        System.out.println();
    }
}