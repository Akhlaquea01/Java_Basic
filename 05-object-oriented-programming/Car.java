/**
 * This class represents a Car, which is a specific type of Vehicle.
 * It serves as a subclass to demonstrate inheritance and polymorphism.
 */
public class Car extends Vehicle {

    // --- Private Field ---
    // This field is specific to the Car class.
    private int numberOfDoors;

    /**
     * Constructor for the Car class.
     *
     * @param make          The make of the car.
     * @param model         The model of the car.
     * @param year          The manufacturing year.
     * @param numberOfDoors The number of doors the car has.
     */
    public Car(String make, String model, int year, int numberOfDoors) {
        // 'super()' calls the constructor of the superclass (Vehicle).
        // It must be the first statement in the constructor.
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    // --- Public Getter ---
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Overriding the honk() method from the Vehicle class.
     * This is a demonstration of polymorphism, where a subclass provides its own
     * specific implementation of a method from its superclass.
     */
    @Override
    public void honk() {
        System.out.println("Beep beep!");
    }

    /**
     * Overriding the toString() method to include car-specific information.
     *
     * @return A string describing the car.
     */
    @Override
    public String toString() {
        // 'super.toString()' calls the toString() method of the superclass.
        return super.toString() + " (" + numberOfDoors + " doors)";
    }
}
