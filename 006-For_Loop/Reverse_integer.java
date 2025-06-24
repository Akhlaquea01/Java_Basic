import java.util.*;

public class Reverse_integer {
    /*
     * You are given an integer N and the task is to reverse the digits of the given
     * integer. Return 0 if the result overflows and does not fit in a 32 bit signed
     * integer
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        sc.close();
        boolean negativeFlag = false;
        if (A < 0) {
            negativeFlag = true;
            A = -A;
        }

        int prev_rev_no = 0, rev_no = 0;
        while (A != 0) {
            int cur_no = A % 10;
            rev_no = (rev_no * 10) + cur_no;

            if ((rev_no - cur_no) / 10 != prev_rev_no) {
                System.out.println(0);
            }
            prev_rev_no = rev_no;
            A = A / 10;
        }
        int result = (negativeFlag == true) ? -rev_no : rev_no;
        System.out.println(result);
    }
}
