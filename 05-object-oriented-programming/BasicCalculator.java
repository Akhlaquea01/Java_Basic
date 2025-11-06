/**
 * This class serves as the superclass in our inheritance demonstration.
 * A superclass (or parent class) is a class that is inherited from by another class (the subclass).
 */
public class BasicCalculator {

    // A field to store the result of a calculation.
    protected int result;

    /**
     * Performs addition.
     *
     * @param x The first number.
     * @param y The second number.
     */
    public void addition(int x, int y) {
        result = x + y;
        System.out.println("The sum is: " + result);
    }

    /**
     * Performs subtraction.
     *
     * @param x The first number.
     * @param y The second number.
     */
    public void subtraction(int x, int y) {
        result = x - y;
        System.out.println("The difference is: " + result);
    }
}
