package java_theory.collections_framework_classes;

import java.util.TreeMap;

/*

TreeMap

Implements the NavigableMap interface. Stores key-value pairs in sorted order based on the keys.
Internally uses a Red-Black Tree, and guarantees O(log n) time complexity for operations like insertion, deletion, and search.

*/

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a new TreeMap (stores key-value pairs in sorted order of keys)
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add key-value pairs to the map
        treeMap.put(3, "Three");  // Adds key 3 with value "Three"
        treeMap.put(1, "One");    // Adds key 1 with value "One"
        treeMap.put(2, "Two");    // Adds key 2 with value "Two"

        // Print the map (sorted by key)
        System.out.println(treeMap);  // Output: {1=One, 2=Two, 3=Three}
    }
}
