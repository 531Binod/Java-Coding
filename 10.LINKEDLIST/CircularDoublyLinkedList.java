public class CircularDoublyLinkedList{
    class Node {
        int val;
        Node next, prev;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head = null;

    // Insert at the head
    public void insertAtHead(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode; // New node becomes the head
        }
        System.out.println("Inserted " + val + " at the head.");
    }

    // Insert at the tail
    public void insertAtTail(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
        }
        System.out.println("Inserted " + val + " at the tail.");
    }

    // Insert at a specific position (1-based index)
    public void insertAtPos(int val, int pos) {
        if (pos <= 0) {
            System.out.println("Position out of bounds.");
            return;
        }

        Node newNode = new Node(val);
        if (head == null) {
            if (pos == 1) {
                head = newNode;
                head.next = head;
                head.prev = head;
                System.out.println("Inserted " + val + " at position 1.");
            } else {
                System.out.println("Position out of bounds.");
            }
            return;
        }

        // Insert at the head if pos is 1
        if (pos == 1) {
            insertAtHead(val);
            return;
        }

        Node current = head;
        int count = 1;

        while (count < pos - 1 && current.next != head) {
            current = current.next;
            count++;
        }

        if (count == pos - 1) {
            Node nextNode = current.next;
            newNode.next = nextNode;
            newNode.prev = current;
            current.next = newNode;
            nextNode.prev = newNode;
            System.out.println("Inserted " + val + " at position " + pos + ".");
        } else {
            System.out.println("Position out of bounds.");
        }
    }

    // Delete the head node
    public void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == head) { // Only one node
            head = null;
        } else {
            Node tail = head.prev;
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
        System.out.println("Deleted the head node.");
    }

    // Delete the tail node
    public void deleteAtTail() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == head) { // Only one node
            head = null;
        } else {
            Node tail = head.prev;
            Node secondLast = tail.prev;
            secondLast.next = head;
            head.prev = secondLast;
        }
        System.out.println("Deleted the tail node.");
    }

    // Delete node at a specific position (1-based index)
    public void deleteAtPos(int pos) {
        if (head == null || pos <= 0) {
            System.out.println("Position out of bounds.");
            return;
        }

        if (pos == 1) {
            deleteAtHead();
            return;
        }

        Node current = head;
        int count = 1;

        while (count < pos && current.next != head) {
            current = current.next;
            count++;
        }

        if (count == pos) {
            Node prevNode = current.prev;
            Node nextNode = current.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;

            System.out.println("Deleted node at position " + pos + ".");
        } else {
            System.out.println("Position out of bounds.");
        }
    }

    // Traverse the list and print the elements
    public void traverse() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        System.out.print("Circular Doubly Linked List: ");
        do {
            System.out.print(current.val + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Search for a value
    public boolean search(int val) {
        if (head == null) {
            return false;
        }

        Node current = head;
        do {
            if (current.val == val) {
                return true;
            }
            current = current.next;
        } while (current != head);

        return false;
    }
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtTail(30);
        list.insertAtPos(15, 2);
        
        list.traverse();
        
        list.deleteAtHead();
        list.deleteAtTail();
        list.deleteAtPos(2);
        
        list.traverse();
        
        System.out.println("Searching for 10: " + list.search(10));
        System.out.println("Searching for 30: " + list.search(30));
    }
}