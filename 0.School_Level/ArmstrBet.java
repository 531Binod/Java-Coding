import java.util.Scanner;

public class ArmstrBet {
    public static void main(String[] args) {
        System.out.println("Enter two no. : ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for(int i=a;i<=b;i++){
            Armstrong(i);

        }  
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
            System.out.println(temp);
        }
    }
    
}
