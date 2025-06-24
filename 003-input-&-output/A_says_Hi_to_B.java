import java.util.*;

public class A_says_Hi_to_B {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String A = scn.next();
        String B = scn.next();
        System.out.print(A + " says Hi to " + B);
        scn.close();
    }
}
