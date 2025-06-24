import java.util.*;

/*
 * Write a program to input T strings (S) from user and print count of vowels and consonants in it.
 */
public class Vowels_vs_Consonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of strings: ");
        int totalCount = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after nextInt()

        while (totalCount > 0) {
            System.out.print("Enter the string: ");
            String input = scanner.nextLine();
            int vowels = 0;
            int consonants = 0;

            for (int i = 0; i < input.length(); i++) {
                char c = Character.toLowerCase(input.charAt(i));
                if (c >= 'a' && c <= 'z') {
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            totalCount--;
        }

        scanner.close();
    }
}