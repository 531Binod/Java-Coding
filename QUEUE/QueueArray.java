public class QueueArray{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        // no frot required bcz after deleting we shift element left i.e front always at 0 index will be maintained
        // Constructor
        Queue(int size){
            this.size = size;
            arr = new int[size];
            rear = -1;
        }
        // isEmty O(1)
        public static boolean isEmpty(){
            //return size==0; wrong staic array whose size is fixed may be contain no element 
            return rear==-1;
        }
        // isFull O(1)
        public static boolean isFull(){
            return rear == size-1;
        }
        // Enqueue O(1) at rear right sides
        public static void add(int val){
            if(isFull()){
                System.out.println("Overflow ");
                return;
            }
            rear++;
            arr[rear] = val;
        }
        // dequeue at front left sides O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Underflow ");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        
        }
        /* 
        // Dequeue O(1) without shifting
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Underflow");
                return -1;
            }
            int frontElement = arr[front];
            front++;  // Simply move the front pointer forward
            return frontElement;
        }
*/

        // peek front element O(0)
        public static int peek(){
            if (isEmpty()) {
                System.out.println("No element ");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue(5); // Give size in constructor
        queue.add(3);
        queue.add(1);
        queue.add(56);
        queue.add(90);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        /* wrong bcz printing left and deleting writ
        while (!isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }*/
    }
}