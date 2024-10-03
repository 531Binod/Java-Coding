public class Maze {
    public static int countPathInMaze(int i, int j, int m, int n){
        if(i==m-1 || j==n-1){
            return 1;
        }
        return countPathInMaze(i, j+1, m, n) + countPathInMaze(i+1, j, m, n);
    }
    public static void main(String[] args) {
        int m = 3;
        int n=3;
        System.out.println(countPathInMaze(0, 0, m, n));
    }
}
