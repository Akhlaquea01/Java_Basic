import java.util.*;

public class Odd_Game {
    /**
     * Write a program to print all odd numbers from 1 to N where you have to take N
     * as input from user. Here N is inclusive.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int i = 1;
        while (i <= N) {
            System.out.print(i + " ");
            i = i + 2;
        }
        scn.close();
    }
}
