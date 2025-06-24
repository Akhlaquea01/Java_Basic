import java.util.Scanner;

/*
 * You are given uppercase string (S) and you have to return a string that is the lower case form of S.
 */
public class High_to_Low {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting input for string A
        System.out.print("Enter the uppercase string: ");
        String A = scanner.nextLine();

        // Creating an instance of High_to_Low class
        High_to_Low solver = new High_to_Low();

        // Calling the solve method and storing the result
        String result = solver.solve(A);

        // Printing the result
        System.out.println("Lowercase form of the string: " + result);
        scanner.close();
    }

    public String solve(String A) {
        String res = "";
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            // Changing uppercase alphabet to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                res += (char) (ch - 'A' + 'a');
            } else {
                res += ch;
            }
        }
        return res;
    }
}
