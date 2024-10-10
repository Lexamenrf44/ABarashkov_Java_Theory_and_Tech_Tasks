package main.java.theory.examples.other_key_java_classes;

/*

BigDecimal

Provides immutable arbitrary-precision decimal numbers.
Often used for high-precision calculations, such as those required in financial applications.

*/

public class BigDecimal {
    public static void main(String[] args) {
        // Create BigDecimal values
        java.math.BigDecimal price = new java.math.BigDecimal("19.99");
        java.math.BigDecimal quantity = new java.math.BigDecimal("2");

        // Multiply the BigDecimal values
        java.math.BigDecimal total = price.multiply(quantity);

        // Print the total
        System.out.println(total);  // Output: 39.98
    }
}
