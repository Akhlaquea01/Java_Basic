import java.util.*;

/*
 * Write a program to input an integer T and then each of T lines will have a string (S).
 * You have to print T lines each containing length of input string.
 */
public class Length_of_String {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = scn.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.println(scn.next().length());
        }
        scn.close();
    }
}
