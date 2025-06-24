import java.util.*;

public class Print_sentence {
    /**
     * Given an english sentence, take it in the input and print it in the output.
     * @Input Single line containing an english sentence.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		String x = scn.nextLine();
		System.out.print(x);
        scn.close();
    }
}
