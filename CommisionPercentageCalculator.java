import java.util.Scanner;

public class CommisionPercentageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the total sales
        System.out.print("Enter the total sales: $");
        double totalSales = scanner.nextDouble();

        // Get the commission amount
        System.out.print("Enter the commission amount: $");
        double commissionAmount = scanner.nextDouble();

        // Calculate the commission percentage
        double commissionPercentage = calculateCommissionPercentage(totalSales, commissionAmount);

        // Display the result
        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Commission Amount: $" + commissionAmount);
        System.out.println("Commission Percentage: " + commissionPercentage + "%");

        // Close the scanner
        scanner.close();
    }

    // Method to calculate commission percentage
    public static double calculateCommissionPercentage(double totalSales, double commissionAmount) {
        if (totalSales != 0) {
            return (commissionAmount / totalSales) * 100;
        } else {
            return 0; // To avoid division by zero
        }
    }
}
