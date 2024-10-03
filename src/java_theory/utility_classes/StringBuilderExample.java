package java_theory.utility_classes;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a new StringBuilder with an initial string
        StringBuilder sb = new StringBuilder("Hello");

        // Append text to the StringBuilder
        sb.append(" World");  // Adds " World" to "Hello"

        // Insert a character at a specific position
        sb.insert(5, ",");  // Inserts a comma after "Hello"

        // Print the modified string
        System.out.println(sb.toString());  // Output: Hello, World
    }
}
