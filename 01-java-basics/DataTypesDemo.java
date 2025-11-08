/**
 * This class provides a comprehensive demonstration of all primitive and non-primitive data types in Java.
 * Each data type is explained with its size, range, and a practical example.
 */
public class DataTypesDemo {

    public static void main(String[] args) {

        // --- Primitive Data Types ---
        // These are the most basic data types in Java and are not objects.

        // byte: 8-bit signed integer. Range: -128 to 127.
        // Useful for saving memory in large arrays.
        byte byteValue = 100;
        System.out.println("byte: " + byteValue);

        // short: 16-bit signed integer. Range: -32,768 to 32,767.
        // Also used for memory saving.
        short shortValue = 30000;
        System.out.println("short: " + shortValue);

        // int: 32-bit signed integer. Range: -2^31 to 2^31-1.
        // The most commonly used integer type.
        int intValue = 2000000000;
        System.out.println("int: " + intValue);

        // long: 64-bit signed integer. Range: -2^63 to 2^63-1.
        // Used when a wider range than int is needed. Note the 'L' suffix.
        long longValue = 9000000000000000000L;
        System.out.println("long: " + longValue);

        // float: 32-bit single-precision floating-point.
        // Used for decimal values. Note the 'f' suffix.
        float floatValue = 3.14f;
        System.out.println("float: " + floatValue);

        // double: 64-bit double-precision floating-point.
        // Used for more precise decimal values. The default choice for decimals.
        double doubleValue = 99.99;
        System.out.println("double: " + doubleValue);

        // boolean: Represents two values: true or false.
        // Used for logical conditions.
        boolean isJavaFun = true;
        System.out.println("boolean: " + isJavaFun);

        // char: A single 16-bit Unicode character.
        // Can represent letters, numbers, or symbols.
        char grade = 'A';
        System.out.println("char: " + grade);


        // --- Non-Primitive Data Types (Reference Types) ---
        // These are created from classes and hold references to objects.

        // String: A sequence of characters. It's an object, not a primitive.
        String greeting = "Hello, World!";
        System.out.println("String: " + greeting);

        // Array: A container that holds a fixed number of values of a single type.
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Object: An instance of a class. Here, we create an instance of the Person class.
        // (Assuming Person.java exists in the same directory).
        Person person = new Person("John Doe", 30);
        System.out.println("Object: " + person);
    }
}
