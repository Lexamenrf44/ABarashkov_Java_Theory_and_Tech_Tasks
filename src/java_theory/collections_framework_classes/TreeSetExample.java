package java_theory.collections_framework_classes;

import java.util.TreeSet;

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

