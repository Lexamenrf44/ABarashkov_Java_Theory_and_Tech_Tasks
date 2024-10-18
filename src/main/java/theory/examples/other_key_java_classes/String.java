package theory.examples.other_key_java_classes;

/*

String

Represents immutable sequences of characters.
Used for handling text, and widely used in Java applications due to its immutability.

*/

public class String {

    public static void main(java.lang.String[] args) {

        // Create a new String
        java.lang.String str = "Hello";

        // Concatenate two strings
        java.lang.String str2 = str.concat(" World");

        // Print the concatenated string
        System.out.println(str2);  // Output: Hello World
    }
}
