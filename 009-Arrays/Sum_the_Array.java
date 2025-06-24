import java.util.*;

public class Sum_the_Array {
    /*
     * Write a program to print sum of elements of the input array A of size N.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }
        scn.close();
        int z = 0;
        for (int i = 0; i < n; i++) {
            z += nums[i];
        }
        System.out.println(z);
    }
}
