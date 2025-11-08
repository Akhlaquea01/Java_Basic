import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program takes an array of integers and returns a new array
 * where each element is the cube of the original element.
 */
public class CubeArrayElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        ArrayList<Integer> originalList = new ArrayList<>();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            originalList.add(scanner.nextInt());
        }

        // --- Cube the Elements and Display the Result ---
        ArrayList<Long> cubedList = cubeElements(originalList);
        System.out.println("\nOriginal list: " + originalList);
        System.out.println("List with cubed elements: " + cubedList);

        scanner.close();
    }

    /**
     * Cubes each element of an ArrayList of integers.
     *
     * @param list The input ArrayList.
     * @return A new ArrayList with each element cubed.
     */
    public static ArrayList<Long> cubeElements(ArrayList<Integer> list) {
        ArrayList<Long> result = new ArrayList<>();
        for (int number : list) {
            // We use 'long' for the result to prevent potential overflow if the cube is large.
            result.add((long) Math.pow(number, 3));
        }
        return result;
    }
}
