import java.util.*;

public class Remaining_Bake_Time {
    /**
     * You're going to write some code to help you cook a gorgeous lasagna from your
     * favorite cookbook. According to your cookbook, the Lasagna should be in the
     * oven for 40 minutes. Given the time (in minutes), the lasagna has been in the
     * oven, find how many more minutes the lasagna still needs to bake for.
     * 
     * @Input The only first line contains the integer N, denoting the actual time
     *        (in minutes) the lasagna has been in the oven for.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        System.out.print(40 - x);
        scn.close();
    }
}
