package java_theory.utility_classes;

import java.util.Objects;

public class ObjectsExample {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "Hello";

        // Safe comparison of two objects
        System.out.println(Objects.equals(s1, s2));  // Output: false

        // Check if an object is null
        System.out.println(Objects.isNull(s1));  // Output: true
    }
}

