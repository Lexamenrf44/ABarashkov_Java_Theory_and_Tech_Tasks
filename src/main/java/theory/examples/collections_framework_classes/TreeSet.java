package theory.examples.collections_framework_classes;

/*

TreeSet

Implements the SortedSet interface. Stores unique elements in a sorted order (natural or custom comparator).
Internally uses a Red-Black Tree; slower than HashSet for basic operations but keeps elements sorted.

*/

public class TreeSet {

    public static void main(String[] args) {

        // Create a new TreeSet of Strings (sorted automatically)
        java.util.TreeSet<String> treeSet = new java.util.TreeSet<>();

        // Add elements to the set
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Mango");

        // Print the set (sorted order)
        System.out.println(treeSet);  // Output: [Apple, Banana, Mango]
    }
}

