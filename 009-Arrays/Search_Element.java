import java.util.*;

public class Search_Element {
    public static void main(String[] args) {
        /*
         * You are given an integer T (number of test cases). You are given array A and
         * an integer B for each test case. You have to tell whether B is present in
         * array A or not.
         * Input 1:
         * 1
         * 5
         * 4 1 5 9 1
         * 5
         * Output 1:
         * 
         * 1
         */

        Scanner sc = new Scanner(System.in);
        // number of test cases
        int T = sc.nextInt();

        // each test case consists of 2 lines
        for (int i = 0; i < T; i++) {

            // 1. Integer denoting the length of array, followed by array elements
            int lengthOfArray = sc.nextInt();
            int[] arrayA = new int[lengthOfArray];
            for (int j = 0; j < lengthOfArray; j++) {
                arrayA[j] = sc.nextInt();
            }
            // 2. integer to search in array
            int elementToSearch = sc.nextInt();
            searchElement(elementToSearch, arrayA);
        }
        sc.close();
    }

    private static void searchElement(int elementToSearch, int arrayA[]) {
        int counter = 0;
        for (int j = 0; j < arrayA.length; j++) {
            if (arrayA[j] == elementToSearch) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}