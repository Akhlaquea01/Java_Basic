import java.util.*;

public class Matrix_Transpose {
    /*
     * You are given a matrix A, you have to return another matrix which is the
     * transpose of A.
     * Input 1:
     * 
     * A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
     * Output 1:
     * 
     * [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns in the matrix: ");
        int cols = scanner.nextInt();

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                int num = scanner.nextInt();
                row.add(num);
            }
            A.add(row);
        }

        ArrayList<ArrayList<Integer>> transpose = solve(A);

        System.out.println("The transpose of the matrix is:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose.get(i).get(j) + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int rows = A.size();
        int cols = A.get(0).size();

        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();

        for (int i = 0; i < cols; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < rows; j++) {
                row.add(A.get(j).get(i));
            }
            transpose.add(row);
        }

        return transpose;
    }
}
