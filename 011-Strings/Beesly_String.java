import java.util.*;

/*
 * Mr. Jim likes playing with strings a lot, so Mrs. Pam gifted him a string A which has some very unique magical powers. The string consists of lowercase latin letters 'p','a' and 'm' only.

In one wish, Mr Jim can perform one of the following operations:
Remove exactly one occurrence of 'p' and exactly one occurrence of 'm', from anywhere inside string A.
Remove exactly one occurrence of 'a' and exactly one occurrence of 'm', from anywhere inside string A.
Now Mr. Jim wants to know if after some number of wishes is it possible to make string A empty.

Return 1 if it is possible to make string A empty after some number of operations otherwise Return 0.
 */
public class Beesly_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting input for string A
        System.out.print("Enter the string: ");
        String A = scanner.nextLine();
        scanner.close();
        // Creating an instance of Beesly_String class
        Beesly_String solver = new Beesly_String();

        // Calling the solve method and storing the result
        int result = solver.solve(A);

        // Checking the result
        if (result == 1) {
            System.out.println("It is possible to make the string empty after some number of operations.");
        } else {
            System.out.println("It is not possible to make the string empty after any number of operations.");
        }
    }

    public int solve(String A) {
        int mCount = 0;
        int apCount = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'm') {
                mCount = mCount + 1;
            } else if ((A.charAt(i) == 'a' || A.charAt(i) == 'p')) {
                apCount += 1;
            }
        }
        return apCount == mCount ? 1 : 0;
    }
}
