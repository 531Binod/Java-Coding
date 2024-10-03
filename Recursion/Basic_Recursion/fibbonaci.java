public class fibbonaci {
    public static int calFibo(int n){
        if(n==0){
            return 0;
        }if(n==1){
            return 1;
        }else{
            return calFibo(n-1) + calFibo(n-2);
        }
    }
    // Using void recursive function
    public static void calFibo2(int n, int a, int b){{
        if(n==0){
            return;
        }
        // if you want to print each value of void recusive call then print statement near the recusive call.
        System.out.print(a+" ");
        calFibo2(n-1,b, a+b);
    }

    }
    public static void main(String[] args) {
        // 0 1 1 2 3 5
        int n=5;
        for(int i=0;i<n;i++){
            System.out.print(calFibo(i)+" ");
        }
        System.out.println("With void recursive call ");
        calFibo2(n,0,1);
        
    }
}
