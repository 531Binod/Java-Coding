import java.util.Scanner;

public class CheckEven {
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=obj.nextInt();
        
        if(n%2==0){
            System.out.println(n+" is Even no. ");
        }else{
            System.out.println(n +" is odd no.");
        }
        System.out.println("All even numbers upto "+ n +" are : ");
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
