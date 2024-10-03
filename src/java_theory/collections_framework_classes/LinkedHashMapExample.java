package java_theory.collections_framework_classes;

import java.util.LinkedHashMap;

/*

LinkedHashMap

Implements the Map interface. Maintains insertion order for key-value pairs.
Useful when you want to iterate over entries in the order they were inserted.

*/

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a new LinkedHashMap (maintains insertion order of key-value pairs)
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Add key-value pairs to the map
        linkedHashMap.put("A", 100);  // Adds key "A" with value 100
        linkedHashMap.put("B", 200);  // Adds key "B" with value 200
        linkedHashMap.put("C", 300);  // Adds key "C" with value 300

        // Print the map (insertion order)
        System.out.println(linkedHashMap);  // Output: {A=100, B=200, C=300}
    }
}

