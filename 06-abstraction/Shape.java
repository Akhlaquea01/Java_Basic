/**
 * This abstract class represents a generic shape and demonstrates the concept of abstraction.
 * Abstraction is the practice of hiding the implementation details of a class and only showing
 * the essential features to the user. An abstract class cannot be instantiated directly.
 */
public abstract class Shape {

    // --- Abstract Methods ---
    // An abstract method is a method that is declared without an implementation.
    // Subclasses are required to provide an implementation for these methods.

    /**
     * Calculates the area of the shape.
     *
     * @return The area of the shape.
     */
    public abstract double getArea();

    /**
     * Calculates the perimeter of the shape.
     *
     * @return The perimeter of the shape.
     */
    public abstract double getPerimeter();

    // --- Concrete Method ---
    // An abstract class can also have concrete (non-abstract) methods.

    /**
     * A concrete method that provides a general description of the shape.
     *
     * @return A string describing the shape.
     */
    public String getDescription() {
        return "This is a generic shape.";
    }
}
