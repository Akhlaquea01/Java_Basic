import java.util.*;

public class Copy_the_Array {
    /*
     * You are given a constant array A and an integer B.
     * 
     * You are required to return another array where outArr[i] = A[i] + B.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int[] copied_array = solve(array, B);
        sc.close();
        System.out.println("Copied array with " + B + " added to each element is " + Arrays.toString(copied_array));
    }

    public static int[] solve(int A[], int B) {
        int n = A.length;
        int ans[] = new int[n];
        // looping from 0 to n-1
        for (int i = 0; i < n; i++) {
            ans[i] = A[i] + B;
        }
        return ans;
    }
}
