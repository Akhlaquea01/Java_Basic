import java.util.LinkedList;

/**
 * This class demonstrates the use of LinkedList, a core part of the Java Collections Framework.
 * A LinkedList is a collection of elements that are linked together. It is particularly efficient
 * for adding and removing elements from the beginning or end of the list.
 */
public class LinkedListDemo {

    public static void main(String[] args) {

        // --- Creating a LinkedList ---
        LinkedList<String> toDoList = new LinkedList<>();

        // --- Adding Elements ---
        toDoList.add("Go to the gym");
        toDoList.add("Buy groceries");
        toDoList.add("Do laundry");
        System.out.println("Initial to-do list: " + toDoList);

        // --- Adding Elements to the Beginning and End ---
        toDoList.addFirst("Wake up early");
        toDoList.addLast("Go to bed early");
        System.out.println("\nUpdated to-do list: " + toDoList);

        // --- Removing Elements from the Beginning and End ---
        toDoList.removeFirst();
        toDoList.removeLast();
        System.out.println("Final to-do list: " + toDoList);
    }
}
