package main.java.theory.examples.other_classes;

import java.util.ArrayList;

/*

ArrayList

Resizable array implementation of the List interface.
Unlike regular arrays in Java, which have a fixed size, an ArrayList can dynamically grow and shrink as elements are added or removed.
It is part of the java.util package

*/

public class DescribeArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of String type to store a list of fruits
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");   // Adds "Apple" to the list
        fruits.add("Banana");  // Adds "Banana" to the list
        fruits.add("Orange");  // Adds "Orange" to the list

        // Print the entire ArrayList
        System.out.println("Fruits list: " + fruits);  // Output: Fruits list: [Apple, Banana, Orange]

        // Access an element from the ArrayList by its index
        String firstFruit = fruits.get(0);  // Gets the first element (index 0)
        System.out.println("First fruit: " + firstFruit);  // Output: First fruit: Apple

        // Remove an element from the ArrayList by its index
        fruits.remove(1);  // Removes the element at index 1 ("Banana")

        // Print the ArrayList after removal
        System.out.println("Fruits list after removal: " + fruits);  // Output: Fruits list after removal: [Apple, Orange]

        // Iterate over the ArrayList using a for-each loop
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);  // Prints each fruit in the list
        }
    }
}

