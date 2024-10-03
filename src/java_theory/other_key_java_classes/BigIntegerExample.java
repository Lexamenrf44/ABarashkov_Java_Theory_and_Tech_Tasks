package java_theory.other_key_java_classes;

import java.math.BigInteger;

/*

BigInteger

Provides immutable arbitrary-precision integers.
Useful when dealing with numbers larger than long can handle.

*/

public class BigIntegerExample {
    public static void main(String[] args) {
        // Create two BigInteger values
        BigInteger bigInt1 = new BigInteger("1000000000000000000");
        BigInteger bigInt2 = new BigInteger("500000000000000000");

        // Add the two BigInteger values
        BigInteger sum = bigInt1.add(bigInt2);

        // Print the sum
        System.out.println(sum);  // Output: 1500000000000000000
    }
}
