import java.util.Scanner;

public class LinearSearchOf2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.s of rows : ");
        int rows=sc.nextInt();
        System.out.println("Enter no.s of column : ");
        int col =sc.nextInt();
        int[][] Arr= new int[rows][col];
        System.out.println("Enter all these value : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                Arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the value to be search : ");
        int find=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(Arr[i][j]==find){
                    
                    System.out.println(find +" found at index "+ i +" , "+j);
                }
            }
        }

    }
}
