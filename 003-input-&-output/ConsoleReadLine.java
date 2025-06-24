import java.util.Scanner;

public class ConsoleReadLine {

    public static void main(String[] args) {
        int currentYear = 2022;

        // Use Scanner to get input safely across environments
        System.out.println(getInputFromScanner(currentYear));

        // Optional: run console version only if available (usually not in IDEs)
        /*
        if (System.console() != null) {
            System.out.println(getInputFromConsole(currentYear));
        } else {
            System.out.println("Console not available. Skipping console input.");
        }
        */
    }

    // Console input (for command-line use only)
    public static String getInputFromConsole(int currentYear) {
        if (System.console() == null) {
            return "System.console() is not available. Please run from a terminal or use Scanner instead.";
        }

        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    // Preferred method using Scanner
    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hi, What's your Name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        int yearOfBirth = 0;
        while (true) {
            System.out.print("What year were you born? ");
            String input = scanner.nextLine();
            try {
                yearOfBirth = Integer.parseInt(input);
                if (yearOfBirth > currentYear || yearOfBirth < currentYear - 120) {
                    System.out.println("Please enter a valid year of birth.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("That's not a valid year. Please enter a numeric year.");
            }
        }

        int age = currentYear - yearOfBirth;
        // Avoid closing scanner tied to System.in
        return "So you are " + age + " years old";
    }
}
