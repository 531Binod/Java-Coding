import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter nos. ");
        int x =obj.nextInt();
        int counter=0;
        for(int i=1; i<=x;i++){
            if(x%i==0){
                counter++;
            }
        
        }if(counter==2) System.out.println(x +" IS PRIME");
        else System.out.println(x+" NOT PRIME");
    }
    
}
