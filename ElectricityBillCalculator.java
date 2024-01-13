
import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        // Define the rate per unit
        double ratePerUnit = 0.12; // Change this according to your electricity provider

        // Get user input for the number of units consumed
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = scanner.nextInt();

        // Calculate the electricity bill
        double billAmount = unitsConsumed * ratePerUnit;

        // Display the result
        System.out.println("Electricity Bill Calculation:");
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Rate per Unit: $" + ratePerUnit);
        System.out.println("Total Bill Amount: $" + billAmount);

        // Close the scanner
        scanner.close();
    }
}