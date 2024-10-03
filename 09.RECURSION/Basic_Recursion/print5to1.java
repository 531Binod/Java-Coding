public class print5to1{

    public static void fun(int n){
        if(n==0){
            return;
        }
        //System.out.print(n+" ");  // 5 4 3 2 1  U can make tree to understand
        fun(n-1);
        System.out.print(n+" ");  // 1 2 3 4 5 
    }
    
    public static void fun1(int n){
        if(n==6){
            return;
        }
        System.out.print(n+" ");  // 1 2 3 4 5 
        fun1(n+1); // call fun1(1) 
        
    }

    public static void main(String[] args) {
        fun(5);
        System.out.println();
        fun1(1);
    }
}