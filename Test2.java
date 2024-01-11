import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int pos=0; int neg=0; int zr=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to continue or 0 to stop ");
        int a=sc.nextInt();
        while(a==1){
            int n=sc.nextInt();
            if(n>0) pos++;
            else if(n<0) neg ++;
            else zr++;
            System.out.println("Enter 1 to continue or 0 to stop ");
            a= sc.nextInt();
        }
        System.out.println("No of +ve numbers are "+pos);
        System.out.println("No of -ve numbers are "+neg);
        System.out.println("No of zero numbers are "+zr);
        

    }
    
}
