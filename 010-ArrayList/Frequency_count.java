import java.util.*;

public class Frequency_count {
    /*
     * You are given an integer array A, you have to return an integer array of same
     * size whose ith element is the frequency count of A[i] in array A .
     * 
     * Input 1:
     * A = [1, 2, 5, 1, 5, 1 ]
     * Output 1:
     * [3, 1, 2, 3, 2, 3]
     */
    public static void main(String[] args) {
        // create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // create an ArrayList of integers
        ArrayList<Integer> A = new ArrayList<Integer>();
        System.out.print("Enter the number of integers in the list: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            A.add(num);
        }

        // call the solve function with the user input
        ArrayList<Integer> result = solve(A);

        // print the result
        System.out.println("Frequency" + result);

        // close the Scanner object
        scanner.close();
    }

    static int count(ArrayList<Integer> A, int k) {
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == k) {
                count += 1;
            }
        }
        return count;
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int c = count(A, A.get(i));
            list.add(c);
        }
        return (list);
    }
}
