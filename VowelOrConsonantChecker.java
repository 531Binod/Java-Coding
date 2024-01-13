import java.util.Scanner;

public class VowelOrConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get a character from the user
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Check if the entered character is a vowel or a consonant
        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        // Convert the character to lowercase for case-insensitive comparison
        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
