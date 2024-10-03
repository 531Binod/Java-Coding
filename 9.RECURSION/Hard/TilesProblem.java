public class TilesProblem {
    // There are tiles of 1 by m and you have to fit in the area of n by m.
    // Find total nos of way to fit. Like put 2 horizontanl , then put 1 tiles vertical the horizontal...
    public static int nosOfWayToFitTiles(int n, int m){
        if(n<m){ // We can't put vertical. Only horizontal so put every tiles horizontally. This is only one way
            return 1;
        }if (m==n) { // Either all tiles horizontal or all tiles vertical. I.e only two way. It is not possible 3 by 3. 
            //and put 1 by 3 tiles. It is not possible to put two tiles vertical and 1 tile horizontal.
            return 2;
        }
        // For horizontal:  nosOfWayToFitTiles(n-1, m)
        // For vertical: nosOfWayToFitTiles(n-m, m)
        return nosOfWayToFitTiles(n-m, m) + nosOfWayToFitTiles(n-1, m);
    }
    public static void main(String[] args) {
        int n=4;
        int m=2;
        System.out.println(nosOfWayToFitTiles(n, m));
    }
}
/*
  Output
  5
  I.E 5 way to fill area 4 by 2 where tiles dimesion is 1 by 2.
  1. 4H 
  2. 4V 
  3. 1H, 2V, 1H
  4. 2V, 2H
  5. 2H, 2V
 */
