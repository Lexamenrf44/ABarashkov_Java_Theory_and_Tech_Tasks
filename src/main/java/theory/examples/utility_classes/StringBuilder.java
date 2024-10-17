package theory.examples.utility_classes;

/*

StringBuilder and StringBuffer

Used to create and manipulate mutable strings.
StringBuilder is faster but not thread-safe.
StringBuffer is thread-safe, with synchronized methods for concurrent access.

*/

public class StringBuilder {
    public static void main(String[] args) {
        // Create a new StringBuilder with an initial string
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello");

        // Append text to the StringBuilder
        sb.append(" World");  // Adds " World" to "Hello"

        // Insert a character at a specific position
        sb.insert(5, ",");  // Inserts a comma after "Hello"

        // Print the modified string
        System.out.println(sb.toString());  // Output: Hello, World
    }
}
