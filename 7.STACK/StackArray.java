public class StackArray {
    static class Stack {
        static int arr[];
        static int size;
        static int top;

        // Constructor to initialize stack
        Stack(int size) {
            this.size = size;
            arr = new int[size];
            top = -1;  // Stack is empty initially
        }

        // isEmpty O(1): Check if the stack is empty
        public static boolean isEmpty() {
            return top == -1;
        }

        // isFull O(1): Check if the stack is full
        public static boolean isFull() {
            return top == size - 1;
        }

        // push O(1): Add an element to the top of the stack
        public static void push(int val) {
            if (isFull()) {
                System.out.println("Stack Overflow");
                return;
            }
            top++;          // Move top pointer up
            arr[top] = val; // Add value at the new top position
        }

        // pop O(1): Remove and return the top element from the stack
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int poppedElement = arr[top]; // Get the top element
            top--;                        // Move the top pointer down
            return poppedElement;
        }

        // peek O(1): Return the top element without removing it
        public static int peek() {
            if (isEmpty()) {
                System.out.println("No elements in stack");
                return -1;
            }
            return arr[top];
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);  // Create a stack of size 5
        
        // Pushing elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Display the top element
        System.out.println("Top element: " + stack.peek());  // Output: 40
        
        // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop());  // Output: 40
        System.out.println("Popped element: " + stack.pop());  // Output: 30

        // Display the top element after popping
        System.out.println("Top element: " + stack.peek());  // Output: 20

        // Empty the stack
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }

        // Try to pop from an empty stack
        System.out.println("Popped element: " + stack.pop());  // Output: Stack Underflow
    }
}
