public class CircularSinglyLinkedList {
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node head = null;

    // Insert at the head
    public void insertAtHead(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            head.next = head; // Point to itself, making it circular
        } else {
            Node tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            newNode.next = head;
            head = newNode;
            tail.next = head; // Complete the circle
        }
        System.out.println("Inserted " + val + " at the head.");
    }

    // Insert at the tail
    public void insertAtTail(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            head.next = head; // Point to itself
        } else {
            Node tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            tail.next = newNode;
            newNode.next = head; // Complete the circle
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

        // Traverse to the position before where the node should be inserted
        while (count < pos - 1 && current.next != head) {
            current = current.next;
            count++;
        }

        if (count == pos - 1) {
            newNode.next = current.next;
            current.next = newNode;
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
            Node tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            head = head.next;
            tail.next = head; // Update tail to point to the new head
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
            Node current = head;
            Node prev = null;

            // Traverse to the second last node
            while (current.next != head) {
                prev = current;
                current = current.next;
            }

            prev.next = head; // Disconnect the last node and complete the circle
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
        Node prev = null;
        int count = 1;

        // Traverse to the node to be deleted
        while (count < pos && current.next != head) {
            prev = current;
            current = current.next;
            count++;
        }

        if (count == pos) {
            prev.next = current.next; // Disconnect the node at position pos
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
        System.out.print("Circular Singly Linked List: ");
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
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();
        
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
