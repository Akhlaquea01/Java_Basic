import java.util.Scanner;

public class Count_upper_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int noOfElements = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after nextInt()

        String str;
        for (int i = 0; i < noOfElements; i++) {
            int count = 0;

            System.out.print("Enter the string: ");
            str = scanner.nextLine();

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch >= 'A' && ch <= 'Z') {
                    count++;
                }
            }

            System.out.println("Number of uppercase letters: " + count);
        }

        scanner.close();
    }
}
