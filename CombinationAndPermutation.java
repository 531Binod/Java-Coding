import java.util.Scanner;

public class CombinationAndPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the values of n and r
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();

        // Calculate nCr and nPr
        long nCrResult = calculateNcr(n, r);
        long nPrResult = calculateNpr(n, r);

        // Display the results
        System.out.println("nCr (" + n + " choose " + r + "): " + nCrResult);
        System.out.println("nPr (" + n + " permute " + r + "): " + nPrResult);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate nCr
    public static long calculateNcr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // Method to calculate nPr
    public static long calculateNpr(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    // Method to calculate factorial
    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
