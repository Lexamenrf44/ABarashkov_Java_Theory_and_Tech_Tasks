package java_theory.other_key_java_classes;

/*

String

Represents immutable sequences of characters.
Used for handling text, and widely used in Java applications due to its immutability.

*/

public class StringExample {
    public static void main(String[] args) {
        // Create a new String
        String str = "Hello";

        // Concatenate two strings
        String str2 = str.concat(" World");

        // Print the concatenated string
        System.out.println(str2);  // Output: Hello World
    }
}
