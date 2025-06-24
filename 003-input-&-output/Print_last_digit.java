import java.util.*;

public class Print_last_digit {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		System.out.print(x%10);
        scn.close();
    }
}
