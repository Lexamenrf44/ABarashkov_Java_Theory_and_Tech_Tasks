package theory.examples.collections_framework_classes;

/*

LinkedList

Implements the List and Deque interfaces. Elements are stored in a doubly-linked list.
Suitable for frequent insertion and deletion of elements, as it does not require shifting elements like an ArrayList.

*/

public class LinkedList {
    public static void main(String[] args) {
        // Create a new LinkedList of Strings
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<>();

        // Add elements to the list
        linkedList.add("First");   // Adds "First" at the end
        linkedList.add("Second");  // Adds "Second" at the end

        // Add an element to the front of the list
        linkedList.addFirst("Zeroth");  // Adds "Zeroth" at the front

        // Add an element to the end of the list
        linkedList.addLast("Third");  // Adds "Third" at the end

        // Print the list
        System.out.println(linkedList);  // Output: [Zeroth, First, Second, Third]

        // Remove the first element
        linkedList.removeFirst();  // Removes "Zeroth"

        // Print the list after removing the first element
        System.out.println(linkedList);  // Output: [First, Second, Third]
    }
}


