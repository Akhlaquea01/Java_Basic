import java.util.Scanner;

/**
 * This program calculates the area of a circle given its radius.
 * It demonstrates the use of the Math.PI constant and formatted output.
 */
public class CircleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // --- Calculate and Display Area ---
        if (radius < 0) {
            System.out.println("The radius cannot be negative.");
        } else {
            double area = calculateCircleArea(radius);
            System.out.printf("The area of the circle with radius %.2f is: %.2f\n", radius, area);
        }

        scanner.close();
    }

    /**
     * Calculates the area of a circle.
     *
     * @param radius The radius of the circle.
     * @return The area of the circle.
     */
    public static double calculateCircleArea(double radius) {
        // The formula for the area of a circle is PI * r^2.
        // Math.PI is a built-in constant for the value of PI.
        return Math.PI * Math.pow(radius, 2);
    }
}
