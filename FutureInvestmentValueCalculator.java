import java.util.Scanner;

public class FutureInvestmentValueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the present value
        System.out.print("Enter the present value: $");
        double presentValue = scanner.nextDouble();

        // Get the annual interest rate
        System.out.print("Enter the annual interest rate (as a decimal): ");
        double annualInterestRate = scanner.nextDouble();

        // Get the number of years
        System.out.print("Enter the number of years: ");
        int numberOfYears = scanner.nextInt();

        // Calculate the future investment value
        double futureValue = calculateFutureValue(presentValue, annualInterestRate, numberOfYears);

        // Display the result
        System.out.println("Future Investment Value after " + numberOfYears + " years: $" + futureValue);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate future investment value
    public static double calculateFutureValue(double presentValue, double annualInterestRate, int numberOfYears) {
        return presentValue * Math.pow((1 + annualInterestRate), numberOfYears);
    }
}
