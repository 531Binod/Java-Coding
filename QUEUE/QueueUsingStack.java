import java.util.*;
public class QueueUsingStack {
    // Using two stack, But it can't implement efficient Queue. I.e either enqueue or dequeue will be order of n.
    // Two way 
    // 1. enqueue O(n), dequeue O(1), peek O(1)
    // 2. enqueue O(1), dequeue O(n), peek O(n)
    static class  Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // isEmpty O(1)
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        // Enqueue O(n)
        public static void add(int data){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        // Dequeue O(1)
        public static int remove(){
            if (s1.isEmpty()) {
                System.out.println("No elelment ");
                return -1;
            }
            return s1.pop();
        }
        // peek O(1)
        public static int peek(){
            if (s1.isEmpty()) {
                System.out.println("No elelment ");
                return -1;
            }
            return s1.peek();
        }

        /*
        // isEmpty: Check if the queue is empty (O(1))
        public static boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();  // Queue is empty if both stacks are empty
        }

        // Enqueue operation (O(1)): Add an element to the queue
        public static void add(int data) {
            s1.push(data);  // Push element to s1 (always O(1))
        }

        // Dequeue operation (O(n)): Remove the front element of the queue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("No element");
                return -1;
            }

            // If s2 is empty, transfer elements from s1 to s2
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());  // Move all elements from s1 to s2 (O(n))
                }
            }

            // Pop the top element from s2 (this is the front of the queue)
            return s2.pop();
        }

        // Peek operation (O(n)): Return the front element without removing it
        public static int peek() {
            if (isEmpty()) {
                System.out.println("No element");
                return -1;
            }

            // If s2 is empty, transfer elements from s1 to s2
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());  // Move all elements from s1 to s2 (O(n))
                }
            }

            // Return the top element of s2 without removing it
            return s2.peek();
        }
            
        // Example
        Let's break it down step by step:
q.add(1): This pushes 1 onto s1. Now, s1 = [1], s2 = [].

q.add(2): This pushes 2 onto s1. Now, s1 = [1, 2], s2 = [].

q.add(3): This pushes 3 onto s1. Now, s1 = [1, 2, 3], s2 = [].

q.remove():

At this point, s2 is empty, so we need to transfer elements from s1 to s2.
We pop elements from s1 and push them onto s2, reversing the order:
Pop 3 from s1, push to s2 → s2 = [3], s1 = [1, 2].
Pop 2 from s1, push to s2 → s2 = [3, 2], s1 = [1].
Pop 1 from s1, push to s2 → s2 = [3, 2, 1], s1 = [].
Now, we pop 1 from s2 (the front of the queue), so the result is 1. After this, s2 = [3, 2], s1 = [].
q.remove():

Now, s2 is not empty, so we just pop the top of s2, which is 2. The result is 2. After this, s2 = [3], s1 = [].
q.add(34):

This pushes 34 onto s1, so now s1 = [34], s2 = [3].
q.peek():

We need to peek at the front of the queue.
Since s2 is not empty, the top element of s2 is the front of the queue. So the result is 3.
         */
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
