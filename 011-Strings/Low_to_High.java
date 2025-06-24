import java.util.*;

/*
 * You are given lowercase string (S) and you have to return a string that is the uppercase form of S.
 */
public class Low_to_High {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting input for string A
        System.out.print("Enter the lowercase string: ");
        String A = scanner.nextLine();

        // Creating an instance of Low_to_High class
        Low_to_High solver = new Low_to_High();

        // Calling the solve method and storing the result
        String result = solver.solve(A);

        // Printing the result
        System.out.println("Uppercase form of the string: " + result);
        scanner.close();
    }

    public String solve(String A) {
        String res = "";
        for (int i = 0; i < A.length(); i++) {
            // Changing lowercase alphabet to uppercase
            res += (char) (A.charAt(i) - 'a' + 'A');
        }
        return res;
    }
}
