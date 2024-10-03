public class CircularQueueArray {
    static class CircularQueue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        // constructor
        CircularQueue(int size){
            this.size = size;
            arr = new int[size];
            rear = -1;
            front  = -1;
        }
        // isEmpty O(1)
        public static boolean isEmpty(){
            return front==-1 && rear == -1;
        }
        // isFull O(1)
        public static boolean isFull(){
            return (rear + 1)% size == front;  // front==0 && rear==size-1, but it's circular
        }
        // Enqueue O(1)
        public static void add(int val){
            if (isFull()) {
                System.out.println("Overflow ");
                return;
            }
            // If it is first element
            if(front==-1){
                front=0; // for 1st element both front & rear have to update otherwise only rear will be update.
            }
            rear = (rear +1)% size;
            arr[rear] = val;
        }
        // Dequeue
        public static int remove(){
            if (isEmpty()) {
                System.out.println("Underflow ");
                return -1;
            }
            int val = arr[front];
            // In case of single element
            if(front==rear){
                front=rear=-1;
            }else{
                front =(front+1)%size;
            }
            return val;
        }
        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("No element");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.add(4);
        cq.add(12);
        cq.add(67);
        cq.add(9);
        System.out.println(cq.remove());
        cq.add(656);
        System.out.println(cq.remove());

        while (!cq.isEmpty()) {
            System.out.println(cq.remove());
        }
    }
}
