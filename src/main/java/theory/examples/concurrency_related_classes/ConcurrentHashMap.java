package theory.examples.concurrency_related_classes;

/*

ConcurrentHashMap

A thread-safe version of HashMap, used in concurrent environments.
Provides efficient, thread-safe access to the map without locking the entire structure.

*/

public class ConcurrentHashMap {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap of String keys and Integer values
        java.util.concurrent.ConcurrentHashMap<String, Integer> map = new java.util.concurrent.ConcurrentHashMap<>();

        // Insert key-value pairs into the map
        map.put("One", 1);     // Adds key "One" with value 1
        map.put("Two", 2);     // Adds key "Two" with value 2
        map.put("Three", 3);   // Adds key "Three" with value 3

        // Retrieve a value from the map by its key
        System.out.println("Value for 'Two': " + map.get("Two"));  // Output: Value for 'Two': 2

        // Concurrent modification: Update a value if a specific key exists
        map.computeIfPresent("One", (key, value) -> value + 10);  // Increases value of "One" by 10

        // Print the updated map
        System.out.println(map);  // Output: {One=11, Two=2, Three=3}

        // Concurrent read: Iterate over the map using lambda expression
        map.forEach((key, value) -> System.out.println(key + " = " + value));
        // Output:
        // One = 11
        // Two = 2
        // Three = 3
    }
}
