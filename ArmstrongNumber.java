import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter no. : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Armstrong(n);
    }
    static void Armstrong(int x){
        int sum = 0;
        int rem;
        int temp = x;
        while (x>0) {
            rem=x%10;
            x/=10;
            sum = sum + rem *rem * rem;
        }
        if (sum==temp) {
            System.out.println("YES");
            
        }else{
            System.out.println("No");
        }
    }
}