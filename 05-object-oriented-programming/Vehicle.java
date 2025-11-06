/**
 * This class represents a generic Vehicle and serves as a superclass for more specific types of vehicles.
 * It demonstrates key OOP concepts like encapsulation and serves as the parent in an inheritance hierarchy.
 */
public class Vehicle {

    // --- Private Fields ---
    // Encapsulation: These fields are hidden from other classes and can only be accessed via public methods.
    private String make;
    private String model;
    private int year;

    /**
     * Constructor for the Vehicle class.
     *
     * @param make  The make of the vehicle (e.g., "Toyota").
     * @param model The model of the vehicle (e.g., "Camry").
     * @param year  The manufacturing year of the vehicle.
     */
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // --- Public Getters ---
    // These methods provide controlled access to the private fields.
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    /**
     * A general method to describe the vehicle's horn sound.
     * This method is intended to be overridden by subclasses (polymorphism).
     */
    public void honk() {
        System.out.println("Generic vehicle horn sound!");
    }

    /**
     * Overriding the toString() method from the Object class.
     * This provides a more meaningful string representation of a Vehicle object.
     *
     * @return A string describing the vehicle.
     */
    @Override
    public String toString() {
        return "Vehicle: " + year + " " + make + " " + model;
    }
}
