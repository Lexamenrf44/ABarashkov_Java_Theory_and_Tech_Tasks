package main.java.theory.utility_classes;

import java.util.ArrayList;
import java.util.Collections;

/*

Collections

A utility class that provides static methods for working with collections.
Includes methods like sort(), binarySearch(), reverse(), shuffle(), and more.

*/

public class CollectionsExample {
    public static void main(String[] args) {
        // Create a new ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements to the list
        list.add(3);
        list.add(1);
        list.add(2);

        // Sort the list
        Collections.sort(list);  // Sorts in ascending order
        System.out.println(list);  // Output: [1, 2, 3]

        // Reverse the list
        Collections.reverse(list);  // Reverses the order
        System.out.println(list);  // Output: [3, 2, 1]
    }
}
