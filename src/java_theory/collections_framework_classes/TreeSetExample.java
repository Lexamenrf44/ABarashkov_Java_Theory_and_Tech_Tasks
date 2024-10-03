package java_theory.collections_framework_classes;

import java.util.TreeSet;

/*

TreeSet

Implements the SortedSet interface. Stores unique elements in a sorted order (natural or custom comparator).
Internally uses a Red-Black Tree; slower than HashSet for basic operations but keeps elements sorted.

*/

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a new TreeSet of Strings (sorted automatically)
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the set
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Mango");

        // Print the set (sorted order)
        System.out.println(treeSet);  // Output: [Apple, Banana, Mango]
    }
}

