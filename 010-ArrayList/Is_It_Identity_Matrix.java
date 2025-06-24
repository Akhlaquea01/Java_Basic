import java.util.*;

public class Is_It_Identity_Matrix {
    /*
     * You are given a N X N square integer matrix A. You have to tell whether A is
     * an identity matrix or not.
     * 
     * Identity matrix is a special square matrix whose main diagonal elements are
     * equal to 1 and all other elements are 0.
     * Input 1:
     * [[1, 0], [0, 1]]
     * Output 1:
     * 1
     */
    public static void main(String[] args) {

        // create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // create a list of lists to store the matrix
        List<List<Integer>> A = new ArrayList<>();
        System.out.print("Enter the size of the matrix: ");
        int n = scanner.nextInt();

        // read the matrix values from the user
        System.out.println("Enter the matrix values:");
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int value = scanner.nextInt();
                row.add(value);
            }
            A.add(row);
        }

        // call the solve function with the user input
        int result = solve(A);

        // print the result
        System.out.println("The matrix is" + (result == 1 ? "" : " not") + " an identity matrix.");

        // close the Scanner object
        scanner.close();
    }

    public static int solve(final List<List<Integer>> A) {
        int N = A.size();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j && A.get(i).get(j) != 1) {
                    return 0;
                }
                if (i != j && A.get(i).get(j) != 0) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
