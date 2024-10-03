package java_theory.collections_framework_classes;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a new LinkedHashSet of integers (maintains insertion order)
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        // Add elements to the set
        linkedHashSet.add(10);
        linkedHashSet.add(5);
        linkedHashSet.add(1);
        linkedHashSet.add(5);  // Duplicate, will be ignored

        // Print the set (insertion order)
        System.out.println(linkedHashSet);  // Output: [10, 5, 1]
    }
}
