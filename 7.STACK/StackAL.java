import java.util.ArrayList;

public class StackAL {
    // Stack implementation using ArrayList (Easier than Array bcz array has staic size and ArrayList has Dynamic size)
    /* 
   public static ArrayList<Integer> stack = new ArrayList<>();
    public  void push(int val){
        stack.add(val);
    }
    public  int pop(){
        if (stack.size()==0) {
            System.out.println("Underfow");
        }
        int top = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return top;
    }
    public int peek(){
        return stack.get(stack.size()-1);
    }
    public static boolean isEmpty(){
        return stack.size()==0;
    }
    */
    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        public void push(int data) {
            list.add(data);
        }

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = list.remove(list.size()-1);
            return top;
        }

        public int peek() {
            if(isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
