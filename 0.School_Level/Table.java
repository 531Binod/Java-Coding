import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i =0;i<11;i++){
            System.out.println(n+"X"+i +"="+n*i);

        }
    }
}
