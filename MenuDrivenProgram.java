import java.util.Scanner;

public class MenuDrivenProgram {
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //int x=obj.nextInt();
        int input;
        do{
            int marks=obj.nextInt();
            if(marks>=90 && marks<=100){
                System.out.println("This is Good");
            }else if(marks>=60 && marks<90){

                System.out.println("This is also Good");
            }else if(marks>=0 && marks<60){
                System.out.println("This is good as well");
            }else{
                System.out.println("Invalid Marks");
            }
            System.out.println("Enter 1 to continue else press any key :");
            input=obj.nextInt();

        }while(input==1);
    }
}

