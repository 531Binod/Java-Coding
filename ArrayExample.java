import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter how many student : ");
        int size=sc.nextInt();
        String[] nameList = new String[size];
        for(int i=0;i<nameList.length;i++){       // u can use size instead of nameList.length
            nameList[i]=sc.next();
        }
        System.out.println("Here are students name : ");
        for(int i=0;i<nameList.length;i++){
            System.out.println(nameList[i]);
        }

    }
}
