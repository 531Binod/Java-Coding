import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the value of N (number of elements)
        System.out.print("Enter the number of elements (N): ");
        int n = scanner.nextInt();

        // Initialize variables
        int sum = 0;

        // Get N numbers from the user
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        // Calculate the average
        double average = (double) sum / n;

        // Display the result
        System.out.println("Average of " + n + " numbers: " + average);

        // Close the scanner
        scanner.close();
    }
}
