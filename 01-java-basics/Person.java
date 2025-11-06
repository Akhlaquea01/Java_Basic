/**
 * Represents a person with a name and age.
 * This class is used to demonstrate object creation and usage in Java.
 */
public class Person {
    String name;
    int age;

    /**
     * Constructs a new Person object.
     *
     * @param name The name of the person.
     * @param age The age of the person.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Returns a string representation of the Person object.
     *
     * @return A string containing the person's name and age.
     */
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
