package theory.examples.other_key_java_classes;

/*

BigInteger

Provides immutable arbitrary-precision integers.
Useful when dealing with numbers larger than long can handle.

*/

public class BigInteger {
    public static void main(String[] args) {
        // Create two BigInteger values
        java.math.BigInteger bigInt1 = new java.math.BigInteger("1000000000000000000");
        java.math.BigInteger bigInt2 = new java.math.BigInteger("500000000000000000");

        // Add the two BigInteger values
        java.math.BigInteger sum = bigInt1.add(bigInt2);

        // Print the sum
        System.out.println(sum);  // Output: 1500000000000000000
    }
}
