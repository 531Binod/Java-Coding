import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Initialize variables
        double totalCredits = 0;
        double totalGradePoints = 0;

        // Get details for each subject
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter details for subject " + i + ":");
            
            // Get credits for the subject
            System.out.print("Enter credits for the subject: ");
            double credits = scanner.nextDouble();

            // Get grade points for the subject
            System.out.print("Enter grade points for the subject: ");
            double gradePoints = scanner.nextDouble();

            // Update total credits and grade points
            totalCredits += credits;
            totalGradePoints += (credits * gradePoints);
        }

        // Calculate the CGPA
        double cgpa = calculateCgpa(totalGradePoints, totalCredits);

        // Display the result
        System.out.println("CGPA: " + cgpa);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate CGPA
    public static double calculateCgpa(double totalGradePoints, double totalCredits) {
        if (totalCredits != 0) {
            return totalGradePoints / totalCredits;
        } else {
            return 0; // To avoid division by zero
        }
    }
}
