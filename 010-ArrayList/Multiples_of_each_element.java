import java.util.*;

/*
 * Given 2 arrays of integers A and B
 *Return a 2D array of integers such that i-th row of the array contains list of values in A such that A[j]%B[i]==0 in A in  *sequential order
 *Input 1:
 *A = [1, 2, 3, 4]
 *B = [1, 2]
 *Output 1:
 *[ [1, 2, 3, 4 ], [ 2, 4] ]
 */
public class Multiples_of_each_element {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        int row = B.size();
        for (int i = 0; i < row; i++) {
            ArrayList<Integer> prod = new ArrayList<Integer>();
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) % B.get(i) == 0) {
                    prod.add(A.get(j));
                }

            }
            result.add(prod);

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting input for array A
        System.out.print("Enter the elements of array A (space-separated integers): ");
        String[] aInput = scanner.nextLine().split(" ");
        ArrayList<Integer> A = new ArrayList<>();
        for (String num : aInput) {
            A.add(Integer.parseInt(num));
        }

        // Getting input for array B
        System.out.print("Enter the elements of array B (space-separated integers): ");
        String[] bInput = scanner.nextLine().split(" ");
        ArrayList<Integer> B = new ArrayList<>();
        for (String num : bInput) {
            B.add(Integer.parseInt(num));
        }

        // Creating an instance of Multiples_of_each_element class
        Multiples_of_each_element solver = new Multiples_of_each_element();

        // Calling the solve method and storing the result
        ArrayList<ArrayList<Integer>> result = solver.solve(A, B);

        // Printing the result
        for (ArrayList<Integer> row : result) {
            System.out.println(row);
        }
        scanner.close();
    }
}
