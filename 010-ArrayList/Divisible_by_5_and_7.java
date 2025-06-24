import java.util.*;

public class Divisible_by_5_and_7 {
    /*
     * Write a program that returns the list of elements that are present in the
     * given list and are divisible by 5 and 7.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading input
        System.out.print("Enter the length of the array: ");
        int lengthOfArray = sc.nextInt();
        int[] arrayA = new int[lengthOfArray];
        System.out.print("Enter the elements of the array: ");
        for (int j = 0; j < lengthOfArray; j++) {
            arrayA[j] = sc.nextInt();
        }

        // Calling the solve function and printing the output
        int[] result = solve(arrayA);
        System.out.print("Elements divisible by 5 and 7: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        // Closing the scanner
        sc.close();
    }

    /*
     * Function to return an array of elements that are present in the given list
     * and are divisible by 5 and 7.
     */
    public static int[] solve(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0 && arr[i] % 7 == 0) {
                ans.add(arr[i]);
            }
        }
        int A[] = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            A[i] = ans.get(i);
        }
        return A;
    }

}
