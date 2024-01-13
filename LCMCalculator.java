import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate and display LCM
        int lcm = calculateLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate LCM using the formula LCM(a, b) = (a * b) / HCF(a, b)
    public static int calculateLCM(int num1, int num2) {
        int hcf = calculateHCF(num1, num2);
        return (num1 * num2) / hcf;
    }

    // Method to calculate HCF using Euclidean algorithm
    public static int calculateHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("HCF IS: ",+ num1);
        return num1;
        //System.out.println("HCF IS: ",+ num1);
    }
}

