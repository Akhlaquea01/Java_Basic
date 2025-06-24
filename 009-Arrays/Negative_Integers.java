import java.util.*;

public class Negative_Integers {
    /*
     * Write a program to print all negative numbers from input array A of size N.
     * Take integer N and N elements of the array as input from user.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        int array[] = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scn.nextInt();
        }
        String negativeNo = "";
        scn.close();
        for (int j = 0; j < N; j++) {
            if (array[j] < 0) {
                negativeNo += array[j] + " ";
            }
        }
        System.out.print(negativeNo);
    }
}
