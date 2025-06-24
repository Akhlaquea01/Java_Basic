import java.util.*;

public class Multiplication_Table {
    /**
     * Write a program to print the multiplication table of the number entered by
     * the user, N.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(N + " * " + i + " = " + N * i);
            i++;
        }
        scn.close();
    }
}
