import java.util.Scanner;

public class TwoDSpiralTraversal {
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
        int start_row=0;
        int end_row= rows-1;
        int start_col=0;
        int end_col=cols-1;
        while(start_col<=end_col && start_row<=end_row){
            for(int col=start_col;col<=end_col;col++){
                System.out.print(matrix[start_row][col]+" ");
            }
            start_row++;
            for(int row=start_row;row<=end_row;row++){
                System.out.print(matrix[row][end_col]+" ");
            }
            end_col --;
            for(int col=end_col; col>=start_col;col--){
                System.out.print(matrix[end_row][col]+" ");
            }
            end_row --;
            for(int row=end_row;row>=start_row;row--){
                System.out.print(matrix[row][start_col]+" ");
            }
            start_col ++;

        }
        System.out.println();
    }
}
