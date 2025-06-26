/**
 * Demonstrates all Java primitive and non-primitive data types with examples.
 * Includes byte, short, int, long, float, double, boolean, char (primitive),
 * and String, arrays, and objects (non-primitive).
 */
public class DataType {
    public static void main(String[] args) {

        // ----------- Primitive Data Types -----------

        // byte: 8-bit signed integer
        byte byteValue1 = 2;
        byte byteValue2 = 4;
        byte byteResult = (byte) (byteValue1 + byteValue2);
        System.out.println("Byte: " + byteResult);

        // short: 16-bit signed integer
        short shortValue1 = 2;
        short shortValue2 = 4;
        short shortResult = (short) (shortValue1 + shortValue2);
        System.out.println("Short: " + shortResult);

        // int: 32-bit signed integer
        int intValue1 = 2;
        int intValue2 = 4;
        int intResult = intValue1 + intValue2;
        System.out.println("Int: " + intResult);

        // long: 64-bit signed integer
        long longValue1 = 2L;
        long longValue2 = 4L;
        long longResult = longValue1 + longValue2;
        System.out.println("Long: " + longResult);

        // float: 32-bit floating point
        float floatValue1 = 2.0f;
        float floatValue2 = 4.0f;
        float floatResult = floatValue1 + floatValue2;
        System.out.println("Float: " + floatResult);

        // double: 64-bit floating point
        double doubleValue1 = 2.0;
        double doubleValue2 = 4.0;
        double doubleResult = doubleValue1 + doubleValue2;
        System.out.println("Double: " + doubleResult);

        // boolean: true or false
        boolean booleanValueTrue = true;
        boolean booleanValueFalse = false;
        System.out.println("Boolean (true): " + booleanValueTrue);
        System.out.println("Boolean (false): " + booleanValueFalse);

        // char: single 16-bit Unicode character
        char charValueA = 'A';
        char charValueUnicode = '\u263A'; // Unicode for ☺
        System.out.println("Char (A): " + charValueA);
        System.out.println("Char (Unicode ☺): " + charValueUnicode);

        // ----------- Non-Primitive Data Types -----------

        // String: sequence of characters (object)
        String greeting = "Hello, Java!";
        System.out.println("String: " + greeting);

        // Array: collection of elements of the same type
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Object: instance of a class
        Person person = new Person("Alice", 25);
        System.out.println("Object: " + person);

        // Null reference (non-primitive can be null)
        String nullString = null;
        System.out.println("Null String: " + nullString);
    }
}

// Example of a simple class for object demonstration
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override toString() for readable output
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}