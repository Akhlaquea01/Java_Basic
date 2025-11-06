/**
 * This class is used to demonstrate abstraction by creating and interacting with Shape and Circle objects.
 */
public class ShapeDemo {

    public static void main(String[] args) {

        // --- Cannot Instantiate an Abstract Class ---
        // The following line would cause a compile error because 'Shape' is abstract.
        // Shape myShape = new Shape();

        // --- Create a Concrete Subclass Object ---
        // We can create an object of the concrete subclass 'Circle'.
        Shape myCircle = new Circle(5.0);

        // --- Using the Methods ---
        // We can call both the abstract methods (which are implemented in Circle)
        // and the concrete methods of the Shape class.
        System.out.println("Description: " + myCircle.getDescription());
        System.out.printf("Area: %.2f\n", myCircle.getArea());
        System.out.printf("Perimeter: %.2f\n", myCircle.getPerimeter());
    }
}
