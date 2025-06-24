import java.util.*;

public class Total_Elapsed_Cooking_Time {
    /**
     * You wrote some code to help you cook a gorgeous lasagna from your favorite
     * cookbook. Now, you want to find the total number of minutes you've been
     * cooking for the sum of your preparation time and the time the lasagna has
     * already spent baking in the oven. The preparation time of one layer is 2
     * minutes. Given the number of layers added to the lasagna and the number of
     * minutes the lasagna has been baking in the oven, find the total elapsed
     * cooking time (prep + bake) in minutes.
     * 
     * @Input There are 2 lines in the input.
     *        The first line contains the integer N denoting the number of layers.
     *        The second line contains the integer M denoting the time the lasagna
     *        has already spent baking in the oven.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        System.out.print((2 * N) + M);
        scn.close();
    }
}
