import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        while (true) {
            System.out.print("Enter a number (enter 0 to terminate): ");
            int num = scanner.nextInt();

            if (num == 0) {
                break; // Exit the loop if 0 is entered
            }

            if (num < 0) {
                sumNegative += num; // Sum of negative numbers
            } else {
                if (num % 2 == 0) {
                    sumPositiveEven += num; // Sum of positive even numbers
                } else {
                    sumPositiveOdd += num; // Sum of positive odd numbers
                }
            }
        }

        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);

        scanner.close();
    }
}
