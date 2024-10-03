import java.util.*;

public class Calculator {
    public static void main(String[] args){
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter 1st no. ");
        Double a = obj.nextDouble();   //if uuse int a then 4/5=0; so use double a ,b to get 4/5=0.8
        System.out.println("Enter 2nd no. ");
        Double b = obj.nextDouble();
        /* 
        System.out.println("Choose an operation:");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo or remainder)");
        int n= obj.nextInt();
        switch(n){
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: if(b==0){
                System.out.println("Invalid Division");
            }else{
                System.out.println(a/b);
            }
            break;
            case 5: if(b==0){
                System.out.println("Invalid Division");
            }else{
            System.out.println(a%b);
            }
            break;
            default: System.out.println("Invalid button");
        }
        */
        char operation =obj.next().charAt(0);
        switch(operation){
            case '+':  // Dont use double quotes bcs it represent string. char always use single quotes.
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            default:
            System.out.println("Invalide operation ");
            
        }

    }
}
