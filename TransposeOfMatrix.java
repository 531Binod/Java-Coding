import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter columns: ");
        int cols=sc.nextInt();
        int[][] matrix= new int[rows][cols];
        System.out.println("Enter matrix value: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("This is it's transpose: ");
        for(int i=0;i<cols;i++){
            for(int j=0; j<rows;j++){
                System.out.print(matrix[j][i]+" ");
            }System.out.println();
        }
    }
}
