import java.util.Scanner;

public class PrintNPrime {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the start no.");
        int s=obj.nextInt();
        System.out.println("Enter the last no. ");
        int l =obj.nextInt();
        System.out.println("List of Prime nos between "+s+" and "+l+" are ");
        for(int i=s;i<=l;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0) return false;
            }
            return true;
        } 
    }
}
