import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x ");
        int x=sc.nextInt();
        System.out.println(("Enter n "));
        int n =sc.nextInt();
        int res=1;
        for(int i=1;i<=n;i++){
            res=res * x;
        }
        System.out.println("The value of "+ x + " to the power "  + n+ " is  " +res);
    }
    
}
