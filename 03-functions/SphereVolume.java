import java.util.Scanner;

/**
 * This program calculates the volume of a sphere given its radius.
 * It demonstrates the use of mathematical formulas and the Math.PI constant.
 */
public class SphereVolume {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // --- Calculate and Display Volume ---
        if (radius < 0) {
            System.out.println("The radius cannot be negative.");
        } else {
            double volume = calculateSphereVolume(radius);
            System.out.printf("The volume of the sphere with radius %.2f is: %.2f\n", radius, volume);
        }

        scanner.close();
    }

    /**
     * Calculates the volume of a sphere.
     *
     * @param radius The radius of the sphere.
     * @return The volume of the sphere.
     */
    public static double calculateSphereVolume(double radius) {
        // The formula for the volume of a sphere is (4/3) * PI * r^3.
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
