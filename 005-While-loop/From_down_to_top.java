import java.util.*;

public class From_down_to_top {
    /**
     * 
     * Write a program to print all Natural numbers from N to 1 where you have to
     * take N as input from user
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        while (A >= 1) {
            System.out.print(A + " ");
            A--;
        }
        scn.close();
    }
}
