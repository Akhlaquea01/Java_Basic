import java.util.*;
/*
 * You are given a character string A having length N.
 * The string consists of 2 types of characters:
 * Alphabets : ['a'-'z', 'A'-'Z']
 * Digits: ['0'-'9']
 * You have to tell the count of characters of the maximum occuring character type.
 */

public class Diverse_Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting input for string A
        System.out.print("Enter the string: ");
        String A = scanner.nextLine();

        // Creating an instance of Diverse_Characters class
        Diverse_Characters solver = new Diverse_Characters();

        // Calling the solve method and storing the result
        int result = solver.solve(A);

        // Printing the result
        System.out.println("Count of characters of the maximum occurring character type: " + result);
        scanner.close();
    }

    public int solve(final String A) {
        int alphaCount = 0;
        int numericCount = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) >= '0' && A.charAt(i) <= '9') {
                numericCount = numericCount + 1;
            } else if ((A.charAt(i) >= 'A' && A.charAt(i) <= 'Z') || (A.charAt(i) >= 'a' && A.charAt(i) <= 'z')) {
                alphaCount += 1;
            }
        }
        return alphaCount > numericCount ? alphaCount : numericCount;
    }
}
