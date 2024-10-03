package java_theory.collections_framework_classes;

import java.util.HashSet;

/*

HashSet

Implements the Set interface. Stores unique elements without maintaining any order.
Based on a hash table; operations like add, remove, and contains have constant time complexity on average.

*/

public class HashSetExample {
    public static void main(String[] args) {
        // Create a new HashSet of integers
        HashSet<Integer> hashSet = new HashSet<>();

        // Add elements to the set
        hashSet.add(1);  // Adds the integer 1
        hashSet.add(2);  // Adds the integer 2
        hashSet.add(3);  // Adds the integer 3
        hashSet.add(1);  // Duplicate, will be ignored

        // Print the set (order is not guaranteed)
        System.out.println(hashSet);  // Output: [1, 2, 3] (no duplicates)
    }
}

