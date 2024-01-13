import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get coordinates of the first point
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        // Get coordinates of the second point
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate the distance
        double distance = calculateDistance(x1, y1, x2, y2);

        // Display the result
        System.out.println("Distance between the two points: " + distance);

        // Close the scanner
        scanner.close();
    }
/* 
    // Method to calculate distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
*/
    // Method to calculate pow
    public static double pow(double x, double y){
        double res=1;
        for(int i=0; i<y;i++){
            res= res*x;
        }
        return res;
    }
    // Method to calculate distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }
}
