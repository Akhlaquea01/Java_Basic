import java.util.*;

class Remove_that {
    /*
     * Write a program to input N numbers array from user and an integer X and print
     * the array by deleting element at specified position X.
     * Example Input
     * 
     * 5
     * 2 3 1 4 2
     * 3
     * Example Output
     * 
     * 2 3 4 2
     */
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        x = x - 1;
        // looping from x to n-2 and making current element equal to the next one
        for (int i = x; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        n = n - 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        scn.close();
    }
}
