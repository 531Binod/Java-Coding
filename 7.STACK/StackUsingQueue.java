import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>(); // Primary queue
        Queue<Integer> q2 = new LinkedList<>(); // Helper queue
        
        // Push operation (O(n))
        public void push(int data) {
             // Move all elements from q1 to q2
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
        
            // Add the new element to q1
            q1.add(data);
        
            // Move all elements back from q2 to q1
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }

        // Pop operation (O(1)): Removes and returns the top element
        public int pop() {
            if (q1.isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return q1.remove(); // The front of q1 is the top of the stack
        }

        // Peek operation (O(1)): Returns the top element without removing it
        public int peek() {
            if (q1.isEmpty()) {
                System.out.println("No elements in stack");
                return -1;
            }
            return q1.peek();
        }

        // isEmpty operation (O(1)): Checks if the stack is empty
        public boolean isEmpty() {
            return q1.isEmpty();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println(stack.peek()); // Output: 30
        
        System.out.println(stack.pop());  // Output: 30
        System.out.println(stack.pop());  // Output: 20
        
        System.out.println(stack.peek()); // Output: 10
        
        System.out.println(stack.pop());  // Output: 10
        System.out.println(stack.isEmpty()); // Output: true
    }
}
