import java.util.*;

public class Max_n_Min_of_an_Array {
    /*
     * Take input an array A of size N and write a program to print maximum and
     * minimum elements of the input. The only line of the input would contain a
     * single integer N that represents the length of the array followed by the N
     * elements of the input array A.
     * 
     * Input Format
     * 
     * The first line contains a single integer N representing the length of the
     * array A followed by N elements of the array A.i.e 5 1 2 3 4 5
     * 
     * Output Format
     * 
     * A single line output containing two space-separated integers.
     * The first integer is the maximum value of the array.
     * The second integer is the minimum value of the array.i.e 5 1
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        int array[] = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scn.nextInt();
        }
        scn.close();
        int max = array[0];
        int min = array[0];
        for (int j = 0; j < N; j++) {
            if (array[j] < min) {
                min = array[j];
            }
            if (array[j] > max) {
                max = array[j];
            }
        }
        System.out.print(max + " " + min);
    }
}
