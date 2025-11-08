/**
 * This class serves as the subclass in our inheritance demonstration.
 * A subclass (or child class) inherits the fields and methods of its superclass.
 * The 'extends' keyword is used to establish the inheritance relationship.
 */
public class AdvancedCalculator extends BasicCalculator {

    /**
     * A new method specific to the AdvancedCalculator class.
     *
     * @param x The first number.
     * @param y The second number.
     */
    public void multiplication(int x, int y) {
        result = x * y; // 'result' is inherited from BasicCalculator.
        System.out.println("The product is: " + result);
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        // Create an object of the subclass.
        AdvancedCalculator myCalculator = new AdvancedCalculator();

        // Call methods from the superclass (BasicCalculator).
        System.out.println("--- Calling Methods from Superclass ---");
        myCalculator.addition(a, b);
        myCalculator.subtraction(a, b);

        // Call the method from the subclass itself.
        System.out.println("\n--- Calling Method from Subclass ---");
        myCalculator.multiplication(a, b);
    }
}
