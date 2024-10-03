import java.util.Scanner;

public class Factorial{
    public static int factorial(int x){
        /*int fact=0;
        if(x>=1){
            fact= fact + x * factorial(x-1);
        return fact;
        }else{
            return;
        }
        */
        if(x<0){
            System.out.println("Invalid number ");
        }
        int fact=1;
        for(int i=x;i>1;i--){
            fact=fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        int n=obj.nextInt();
        int res=factorial(n);
        System.out.println("Factorial of "+ n + " is "+ res);
    }

}