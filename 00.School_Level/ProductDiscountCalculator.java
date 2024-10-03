import java.util.Scanner;

public class ProductDiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the original price of the product
        System.out.print("Enter the original price of the product: $");
        double originalPrice = scanner.nextDouble();

        // Get the discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        // Calculate the discount amount
        double discountAmount = (discountPercentage / 100) * originalPrice;

        // Calculate the discounted price
        double discountedPrice = originalPrice - discountAmount;

        // Display the result
        System.out.println("Original Price: $" + originalPrice);
        System.out.println("Discount Percentage: " + discountPercentage + "%");
        System.out.println("Discount Amount: $" + discountAmount);
        System.out.println("Discounted Price: $" + discountedPrice);

        // Close the scanner
        scanner.close();
    }
}
