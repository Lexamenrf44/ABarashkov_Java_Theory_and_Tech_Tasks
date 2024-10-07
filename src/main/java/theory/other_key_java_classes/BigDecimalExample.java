package main.java.theory.other_key_java_classes;

import java.math.BigDecimal;

/*

BigDecimal

Provides immutable arbitrary-precision decimal numbers.
Often used for high-precision calculations, such as those required in financial applications.

*/

public class BigDecimalExample {
    public static void main(String[] args) {
        // Create BigDecimal values
        BigDecimal price = new BigDecimal("19.99");
        BigDecimal quantity = new BigDecimal("2");

        // Multiply the BigDecimal values
        BigDecimal total = price.multiply(quantity);

        // Print the total
        System.out.println(total);  // Output: 39.98
    }
}
