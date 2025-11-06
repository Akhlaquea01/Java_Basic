import java.util.Scanner;

/**
 * This program calculates the percentage and grade for a student based on their marks in five subjects.
 * It demonstrates the use of methods and if-else if-else statements.
 */
public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get Marks for Five Subjects ---
        System.out.println("Enter the marks for five subjects (out of 100):");
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // --- Calculate Percentage and Grade ---
        double percentage = calculatePercentage(marks);
        char grade = determineGrade(percentage);

        // --- Display Results ---
        System.out.println("\n--- Results ---");
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    /**
     * Calculates the average percentage from an array of marks.
     *
     * @param marks An array of integer marks.
     * @return The calculated percentage as a double.
     */
    public static double calculatePercentage(int[] marks) {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return (double) totalMarks / marks.length;
    }

    /**
     * Determines the grade based on a given percentage.
     *
     * @param percentage The percentage to determine the grade for.
     * @return The grade as a character.
     */
    public static char determineGrade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else if (percentage >= 40) {
            return 'E';
        } else {
            return 'F';
        }
    }
}
