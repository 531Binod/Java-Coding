public class Pattern31 {
    public static void main(String[] args) {
        pattern(4);
    }
    static public void pattern(int n){
        int N = 2*n -1;
        for(int row=0; row<N;row++){
            for(int col =0 ; col < N; col++){
                /* 
                int rowStart =0;
                int rowEnd = 2*n -2;
                int colEnd = 2*n -2;
                int colStart = 0;
                int value = n;
                while(rowStart< rowEnd && colStart < colEnd && value>0){
                    if(i==rowStart || i==rowEnd || j==colStart || j== colEnd){
                        System.out.print(value +" ");
                    }
                    
                    rowEnd --;
                    rowStart ++;
                    colEnd --;
                    colStart ++;
                    value --;
                }
                */
                int value = n - Math.min(Math.min(row , col),Math.min(N-1-row, N-1-col) );
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}