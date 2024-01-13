import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the total runs scored
        System.out.print("Enter the total runs scored: ");
        int totalRuns = scanner.nextInt();

        // Get the total number of times out
        System.out.print("Enter the total number of times out: ");
        int totalOuts = scanner.nextInt();

        // Calculate the batting average
        double battingAverage = calculateBattingAverage(totalRuns, totalOuts);

        // Display the result
        System.out.println("Batting Average: " + battingAverage);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate batting average
    public static double calculateBattingAverage(int totalRuns, int totalOuts) {
        if (totalOuts != 0) {
            return (double) totalRuns / totalOuts;
        } else {
            return 0; // To avoid division by zero
        }
    }
}
