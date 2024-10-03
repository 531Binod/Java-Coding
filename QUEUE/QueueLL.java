public class QueueLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        // Check if the queue is empty
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // No isFull method, as Linked List has dynamic size.

        // Enqueue: Add element to the tail of the queue
        public static void add(int data) {
            Node node = new Node(data);
            if (isEmpty()) {
                head = node;
                tail = node;
                return;
            }
            tail.next = node;
            tail = node;
        }

        // Dequeue: Remove element from the head of the queue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Underflow");
                return -1;
            }
            int front = head.data;

            // If there's only one element in the queue
            if (head == tail) {
                tail = null;  // Update tail to null, but head will be updated below
            }
            head = head.next;  // Move the head to the next node
            return front;
        }

        // Peek: Return the front element without removing it
        public static int peek() {
            if (isEmpty()) {
                System.out.println("No element");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(4);
        q.add(9);
        q.add(4);
        q.add(12);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
