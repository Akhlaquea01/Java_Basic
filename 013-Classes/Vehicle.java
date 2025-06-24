// Class Declaration
public class Vehicle {
    // Fields
    private String make;
    private String model;
    private int year;
    private static int numberOfVehicles = 0; // Static field

    // Constructors
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        numberOfVehicles++;
    }

    // Methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Static Method
    public static int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    // Polymorphism (Overriding)
    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }

    // Inheritance
    public static class Car extends Vehicle {
        private int numberOfDoors;

        public Car(String make, String model, int year, int numberOfDoors) {
            super(make, model, year);
            this.numberOfDoors = numberOfDoors;
        }

        public int getNumberOfDoors() {
            return numberOfDoors;
        }

        @Override
        public String toString() {
            return super.toString() + ", " + numberOfDoors + " doors";
        }
    }

    public static void main(String[] args) {
        Vehicle car1 = new Car("Toyota", "Camry", 2020, 4);
        Vehicle car2 = new Car("Honda", "Civic", 2022, 2);

        System.out.println(car1); // Polymorphism
        System.out.println(car2); // Polymorphism

        System.out.println("Total number of vehicles: " + Vehicle.getNumberOfVehicles());
    }
}
