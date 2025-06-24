import java.util.*;

public class Find_the_Area_of_Circle {
    /*
     * Write a function to calculate and return the area of a circle by using the
     * radius of the circle given as a parameter.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int radius;
        radius = sc.nextInt();
        double area = area(radius);
        sc.close();
        System.out.println("Area in float format rounded upto 2 decimal places is " + area);
    }

    public static double area(int radius) {
        return Double.parseDouble(String.format("%.2f", (3.14159 * radius * radius)));
    }
}
