import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = calculateSumOfDigits(number);

        System.out.println("The sum of the digits of " + number + " is: " + sum);

        scanner.close();
    }

    // Function to calculate the sum of digits of a number
    static int calculateSumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {
            // Extract the last digit and add it to the sum
            sum += num % 10;

            // Remove the last digit from the number
            num /= 10;
        }

        return sum;
    }
}
