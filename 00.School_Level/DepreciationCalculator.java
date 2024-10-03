import java.util.Scanner;

public class DepreciationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the initial value of the asset
        System.out.print("Enter the initial value of the asset: $");
        double initialValue = scanner.nextDouble();

        // Get the salvage value of the asset
        System.out.print("Enter the salvage value of the asset: $");
        double salvageValue = scanner.nextDouble();

        // Get the useful life of the asset
        System.out.print("Enter the useful life of the asset (in years): ");
        int usefulLife = scanner.nextInt();

        // Calculate the straight-line depreciation
        double depreciation = calculateStraightLineDepreciation(initialValue, salvageValue, usefulLife);

        // Display the result
        System.out.println("Initial Value: $" + initialValue);
        System.out.println("Salvage Value: $" + salvageValue);
        System.out.println("Useful Life: " + usefulLife + " years");
        System.out.println("Straight-Line Depreciation: $" + depreciation + " per year");

        // Close the scanner
        scanner.close();
    }

    // Method to calculate straight-line depreciation
    public static double calculateStraightLineDepreciation(double initialValue, double salvageValue, int usefulLife) {
        if (usefulLife != 0) {
            return (initialValue - salvageValue) / usefulLife;
        } else {
            return 0; // To avoid division by zero
        }
    }
}
