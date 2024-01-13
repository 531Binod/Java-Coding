import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Reverse the string using a loop
        String reversedString = reverseStringUsingLoop(inputString);

        // Display the reversed string
        System.out.println("Reversed String: " + reversedString);

        // Close the scanner
        scanner.close();
    }

    // Method to reverse a string using a loop
    public static String reverseStringUsingLoop(String input) {
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            // Swap characters at start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }

        return new String(charArray);
    }
}
