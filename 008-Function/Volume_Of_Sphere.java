import java.util.*;

public class Volume_Of_Sphere {
    /**
     * You are given a positive integer A denoting the radius of a sphere. You have
     * to calculate the volume of the sphere.
     * Volume of a sphere having radius R is given by (4 * π * R3) / 3.
     * 
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int radius;
        radius = sc.nextInt();
        int volume = solve(radius);
        sc.close();
        System.out.println("The volume of the sphere with radius " + radius + " is " + volume);
    }

    public static int solve(final int radius) {
        double volume = (4 * Math.PI * radius * radius * radius) / 3;
        int celi = (int) Math.ceil(volume);
        return celi;
    }
}