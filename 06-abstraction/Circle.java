/**
 * This class represents a Circle, which is a specific type of Shape.
 * It provides concrete implementations for the abstract methods in the Shape class.
 */
public class Circle extends Shape {

    // --- Private Field ---
    private double radius;

    /**
     * Constructor for the Circle class.
     *
     * @param radius The radius of the circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Provides the implementation for the abstract getArea() method.
     *
     * @return The area of the circle.
     */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Provides the implementation for the abstract getPerimeter() method.
     *
     * @return The perimeter (circumference) of the circle.
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Overrides the getDescription() method to provide a more specific description.
     *
     * @return A string describing the circle.
     */
    @Override
    public String getDescription() {
        return "This is a circle with radius " + radius + ".";
    }
}
