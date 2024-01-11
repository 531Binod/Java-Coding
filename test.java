import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 To Enter Marks:");
        
        System.out.println("Enter 0 To exit");
        int exc = sc.nextInt();
        if(exc == 1 ){

            do{
            System.out.print("Enter the marks: ");
            int marks = sc.nextInt();
            if(marks>=90) System.out.println("This is Good");
            else if(89>= marks && marks>=60) System.out.println("This is also Good");
            else if(59>=marks && marks>=0) System.out.println("This is Good as well");
            
            System.out.println("Do you want to enter marks again? (yes-->1 or no--> 0)");
            exc =sc.nextInt();

            
        }while(exc==1);
        }

        
    }
    
}
