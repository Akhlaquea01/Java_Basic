import java.util.ArrayList;
import java.util.Scanner;

public class Add_the_matrices {
    /*
     * You are given two matrices A & B of same size, you have to return another
     * matrix which is the sum of A and B.
     * Input 1:
     * 
     * A = [[1, 2, 3],
     * [4, 5, 6],
     * [7, 8, 9]]
     * 
     * B = [[9, 8, 7],
     * [6, 5, 4],
     * [3, 2, 1]]
     * 
     * Output 1:
     * 
     * [[10, 10, 10],
     * [10, 10, 10],
     * [10, 10, 10]]
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the input matrices
        System.out.println("Enter the number of rows and columns of the matrices: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("Enter the first matrix: ");
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(sc.nextInt());
            }
            A.add(row);
        }

        System.out.println("Enter the second matrix: ");
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(sc.nextInt());
            }
            B.add(row);
        }

        ArrayList<ArrayList<Integer>> result = solve(A, B);

        // Output
        for (ArrayList<Integer> row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A,
            ArrayList<ArrayList<Integer>> B) {
        int row = A.size();
        int col = A.get(0).size();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int sum = A.get(i).get(j) + B.get(i).get(j);
                A.get(i).set(j, sum);
            }
        }
        return A;
    }

}
