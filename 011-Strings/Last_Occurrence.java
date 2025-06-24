import java.util.Scanner;

public class Last_Occurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting input for string A
        System.out.print("Enter the string: ");
        String A = scanner.nextLine();

        // Getting input for ASCII code B
        System.out.print("Enter the ASCII code: ");
        int B = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        scanner.close();

        // Creating an instance of Last_Occurrence class
        Last_Occurrence solver = new Last_Occurrence();

        // Calling the solve method and storing the result
        int result = solver.solve(A, B);

        // Checking the result
        if (result != -1) {
            System.out.println("Last occurrence of character with ASCII code " + B + " found at index " + result);
        } else {
            System.out.println("Character with ASCII code " + B + " does not exist in the string.");
        }
    }

    public int solve(final String A, final int B) {
        int size = A.length() - 1;
        for (int i = size; i >= 0; i--) {
            char ch = A.charAt(i);
            if (ch == B) {
                return i;
            }
        }
        return -1;
    }
}
