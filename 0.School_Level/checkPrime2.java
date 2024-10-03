import java.util.Scanner;

public class checkPrime2 {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int a =obj.nextInt();
        /* Wrong answer for 6
        if(a==1){System.out.println(a +"  is not Prime");}
        //else if(a==2){System.out.println(a+" is prime");}
        else{
            for(int i=2;i<a;i++){
                if(a%i==0){
                    System.out.println(a+" is not prime");
                    break;
                }
            }
            System.out.println(a+" is prime");
        }
        */
        int temp=0;
        for(int i=2;i<(int)Math.sqrt(a)+1;i=i+2){
            if(a%i==0){
                temp=1;
                break;
            }
        }
        if(temp==0 && a!=1){System.out.println(a+" is prime");}
        else{System.out.println(a+" is not prime");}
    }
}       
       
            
        
    

