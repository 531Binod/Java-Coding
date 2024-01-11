import java.util.Scanner;

public class Exercise1 {
    public static float average(int a, int b, int c){
        int avg=(a+b+c)/3;
        return avg;
    }
    public static int sumOfOdd(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static int greater(int a, int b){
        if(a>b) return a;
        else return b;
    }
    public static double getCircumference(float r){
        return 2*3.14*r;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.out.println("Its average is "+ average(x, y, z));
        System.out.println("Enter value to print sum of odd no.");
        int a=sc.nextInt();
        System.out.println("sum of odd no. between 1 and "+a+" are  " + sumOfOdd(a));
        System.out.println("Enter two no to find greater ");
        int p=sc.nextInt();
        int q=sc.nextInt();
        System.out.println(greater(p, q) +" is grater than other ");
        System.out.println("Enter radious ");
        float r= sc.nextFloat();
        System.out.println(getCircumference(r));
    }
}
