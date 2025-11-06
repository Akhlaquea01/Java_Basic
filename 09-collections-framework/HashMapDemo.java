import java.util.HashMap;
import java.util.Map;

/**
 * This class demonstrates the use of HashMap, a core part of the Java Collections Framework.
 * A HashMap stores items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
 * Keys are unique.
 */
public class HashMapDemo {

    public static void main(String[] args) {

        // --- Creating a HashMap ---
        // This HashMap will store String keys and Integer values.
        Map<String, Integer> cityPopulations = new HashMap<>();

        // --- Adding Key-Value Pairs ---
        cityPopulations.put("New York", 8419000);
        cityPopulations.put("Los Angeles", 3980000);
        cityPopulations.put("Chicago", 2716000);
        System.out.println("HashMap of city populations: " + cityPopulations);

        // --- Accessing a Value by its Key ---
        Integer newYorkPopulation = cityPopulations.get("New York");
        System.out.println("The population of New York is: " + newYorkPopulation);

        // --- Iterating over a HashMap ---
        System.out.println("\nIterating over the HashMap:");
        for (Map.Entry<String, Integer> entry : cityPopulations.entrySet()) {
            System.out.println("- City: " + entry.getKey() + ", Population: " + entry.getValue());
        }

        // --- Removing an Element ---
        cityPopulations.remove("Chicago");
        System.out.println("\nHashMap after removing 'Chicago': " + cityPopulations);

        // --- Checking if a Key Exists ---
        boolean hasLosAngeles = cityPopulations.containsKey("Los Angeles");
        System.out.println("Does the map contain 'Los Angeles'? " + hasLosAngeles);
    }
}
