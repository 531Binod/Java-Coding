public class factorial {
    // With void recursive function. Need to pass every variable inside function argument and in termination condition must print 
    //final result bcz it will nothing return. THen u only need to call this function into main.
    public static void calFact(int n, int ans){
        if(n<0){
            return;
        }
        if(n==0 || n==1){
            System.out.println(ans);
            return ;
        }
        ans *= n;
        calFact(n-1, ans);
    }
    // With non-void recursive function. It require less variable or argument inside function and in termination condition must return value
    // THen not only need to call this function into main. U need to print recursive funcion inside main.
    public static int myFact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * myFact(n-1);
    }
    public static void main(String[] args) {
        calFact(4, 1);
        System.out.println("This is fact with int type of function ");
        System.out.println(myFact(4));
    }
}
