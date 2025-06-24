import java.util.Scanner;
/*
 * Shivam has a string A of size N containing only lowercase characters. He will update the string by inserting a number after every char which will be the index of that char.

For E.g.: if string is azd then it will be updated as a1z26d4 since index of a is 1, of z is 26 and of d is 4.

You have to tell how the string will look like afterwards,
Input 1:
scaler
Output 1:
s19c3a1l12e5r18
 */

public class Char_Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting input for string A
        System.out.print("Enter the string: ");
        String A = scanner.nextLine();
        scanner.close();

        // Creating an instance of Char_Index class
        Char_Index solver = new Char_Index();

        // Calling the solve method and storing the result
        String result = solver.solve(A);

        // Displaying the result
        System.out.println("Modified string: " + result);
    }

    public String solve(String A) {
        String string = "";
        for (int i = 0; i < A.length(); i++) {
            int a = (int) (A.charAt(i) - 'a' + 1);
            char c = A.charAt(i);
            string += c;
            string += a;
        }
        return string;
    }
}
