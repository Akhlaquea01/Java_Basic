import java.util.Scanner;

public class Largest_in_each_Row_of_2D_Array {
    /*
     * Given a 2D integer array A of size NxM. You need to find the maximum element
     * (which is unique) of each row of the array and return the answers in an
     * array. Input: A = [ [1, 2, 3], [4, 5, 6], [7, 8, 9] ] Output: [3, 6, 9]
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int m = scanner.nextInt();

        int[][] A = new int[n][m];

        System.out.println("Enter the elements of the matrix A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        int[] ans = solve(A);

        System.out.println("The maximum elements of each row are:");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            // Finding maximum element of ith row
            for (int j = 0; j < m; j++) {
                ans[i] = Math.max(ans[i], A[i][j]);
            }
        }

        return ans;
    }
}
