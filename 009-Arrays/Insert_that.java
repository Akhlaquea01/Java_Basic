import java.util.*;

public class Insert_that {
    /*
     * Write a program to input N numbers array, a number X and a number Y from user
     * and insert an element Y in it at specified position X. X is based on 1-based
     * indexing.
     * Example Input
     * 
     * Input 1:
     * 5
     * 
     * 2 3 1 4 2
     * 
     * 3
     * 
     * 5
     * Output 1:
     * Clearly after inserting 5 at 3rd position, new array is 2 3 5 1 4 2.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        int array[] = new int[N + 1];
        for (int i = 0; i < N; i++) {
            array[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int y = scn.nextInt();
        for (int i = N; i >= x; i--) {
            array[i] = array[i - 1];
        }
        array[x - 1] = y;
        for (int i = 0; i < N + 1; i++) {
            System.out.print(array[i] + " ");
        }
        scn.close();
    }
}
