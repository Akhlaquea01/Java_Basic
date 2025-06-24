import java.util.*;

/*
 * You are given a character string A, having length N and an integer ASCII code B.
 * You have to tell the leftmost occurrence of the character having ASCII code equal to B, in A or report that it does not exist.
 * Input 1:
 *  A = "aabbcc"
 * B = 98 
 * Output: 2 
 */
public class First_Occurrence {
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
        // Creating an instance of First_Occurrence class
        First_Occurrence solver = new First_Occurrence();

        // Calling the solve method and storing the result
        int result = solver.solve(A, B);

        // Checking the result
        if (result != -1) {
            System.out.println("Leftmost occurrence of character with ASCII code " + B + " found at index " + result);
        } else {
            System.out.println("Character with ASCII code " + B + " does not exist in the string.");
        }
    }

    public int solve(final String A, final int B) {
        int N = A.length();

        int idx = -1;

        for (int i = 0; i < N; i++) {
            // If ascii value of character at ith postion is equal to B
            if (A.charAt(i) == B) {
                idx = i;
                break;
            }
        }
        return idx;
    }
}
