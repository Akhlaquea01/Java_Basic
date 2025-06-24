import java.util.Scanner;
/*
You will be given a constant string (A).
You have to return another copy of that input string after removing last character from it.
 */

public class Copy_The_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting input for string A
        System.out.print("Enter the string: ");
        String A = scanner.nextLine();
        scanner.close();

        // Creating an instance of Copy_The_String class
        Copy_The_String solver = new Copy_The_String();

        // Calling the solve method and storing the result
        String result = solver.solve(A);

        // Displaying the result
        System.out.println("Modified string: " + result);
    }

    public String solve(final String A) {
        String string = "";
        for (int i = 0; i < A.length() - 1; i++) {
            string += A.charAt(i);
        }
        return string;
    }
}
