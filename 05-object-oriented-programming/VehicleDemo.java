/**
 * This class is used to demonstrate inheritance and polymorphism
 * by creating and interacting with Vehicle and Car objects.
 */
public class VehicleDemo {

    public static void main(String[] args) {

        // --- Create a generic Vehicle object ---
        Vehicle myVehicle = new Vehicle("Ford", "Transit", 2018);
        System.out.println("Created a generic vehicle: " + myVehicle);
        myVehicle.honk();

        // --- Create a Car object ---
        // A Car object is also a Vehicle object due to inheritance.
        Vehicle myCar = new Car("Toyota", "Camry", 2023, 4);
        System.out.println("\nCreated a car: " + myCar);

        // --- Polymorphism in action ---
        // The JVM determines at runtime which version of the honk() method to call
        // based on the actual type of the object ("Car" in this case).
        myCar.honk();
    }
}
