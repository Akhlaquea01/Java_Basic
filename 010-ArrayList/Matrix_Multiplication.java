import java.util.ArrayList;
import java.util.Scanner;

public class Matrix_Multiplication {
    /*
     * You are given two integer matrices A(having M X N size) and B(having N X P).
     * You have to multiply matrix A with B and return the resultant matrix. (i.e.
     * return the matrix AB).
     * Input 1:
     * 
     * 2 2 1 2 3 4
     * 2 2 5 6 7 8
     * Output 1:
     * 
     * [[19, 22],
     * [43, 50]]
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns in matrix A: ");
        int colsA = scanner.nextInt();

        System.out.println("Enter the elements of matrix A:");
        ArrayList<ArrayList<Integer>> A = readMatrix(rowsA, colsA, scanner);

        System.out.print("Enter the number of rows in matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns in matrix B: ");
        int colsB = scanner.nextInt();

        System.out.println("Enter the elements of matrix B:");
        ArrayList<ArrayList<Integer>> B = readMatrix(rowsB, colsB, scanner);

        ArrayList<ArrayList<Integer>> result = solve(A, B);

        System.out.println("The resultant matrix AB is:");
        printMatrix(result);

        scanner.close();
    }

    public static ArrayList<ArrayList<Integer>> readMatrix(int rows, int cols, Scanner scanner) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                int num = scanner.nextInt();
                row.add(num);
            }
            matrix.add(row);
        }

        return matrix;
    }

    public static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A,
            ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int rowA = A.size();
        int colA = A.get(0).size();
        int colB = B.get(0).size();

        for (int rowIndexA = 0; rowIndexA < rowA; rowIndexA++) {
            ArrayList<Integer> prod = new ArrayList<>();
            for (int colIndexB = 0; colIndexB < colB; colIndexB++) {
                int sum = 0;
                for (int colIndexA = 0; colIndexA < colA; colIndexA++) {
                    sum += A.get(rowIndexA).get(colIndexA) * B.get(colIndexA).get(colIndexB);
                }
                prod.add(sum);
            }
            result.add(prod);
        }
        return result;
    }
}
