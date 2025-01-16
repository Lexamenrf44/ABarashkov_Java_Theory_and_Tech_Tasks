package neetcode.find;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindPalindromeBooleanViaReverseStringTests {

    @Test
    void validPalindromeTest() {
        String s = "Hola aloh!";
        assertTrue(isPalindrome(s));
    }

    @Test
    void invalidPalindromeTest() {
        String s = "Hola World!";
        assertFalse(isPalindrome(s));
    }

    @Test
    void nullPalindromeTest() {
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> isPalindrome(null));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("The String must not be null"));
    }

    @Test
    void emptyPalindromeTest() {
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> isPalindrome(""));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("The String must not be empty"));
    }

    @Test
    void outOfLowerBoundariesPalindromeTest() {
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> isPalindrome("A"));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("The String must contain between 2 and 1000 characters"));
    }

    @Test
    void outOfUpperBoundariesPalindromeTest() {
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> isPalindrome("JmvVsU1KcUjTtB7OOQE3i4ugUcPZCkZYirBX7W0f6EO32IUTMoptAIUZFYRDfXvHtBqkd79BX70NqTycZNkm62Qz0i6lwrz3dVnD853ctMqYILNfhoGOeUB9AxjNuOKURqQGMzjL8QOap0lcxd8f95tGZ5spNmiyGdh9pzbvb1LpQLAkH6DDkplQbS1P7GL9jJiia9VAjWaqs1edhrgp7rTWJfXEcb4lFzaCXLHHDh3sMcHO0JSTgRQRSN7TEhpAfW8xQBo9yQ9aRuypBEHlOwN0NWT62rwqXgAdBPFg0RcdKq12hhPitSjqhbSst8a2fdZW1JHdp0io44rx2egUqqOmpvBxGssbiIT2YsAcls9ebF13brY5aMuOMj16pHDRrYHcoRpaufiDKTXvRMcGdqLAHdONxgHwlGs8zsg4qhIP99GzDtUnMUjZGXHajJfJQWfBu8ARYEN6HAKoJKdvflMMtcMeVbOnYwPTVJyTTxQ6KyTcjGZELnttixVDlPkbo1H0xKIjmaHGXt5hUYb7B4h2KgEfBojt7zOtHWtrMoBRgDKl8b2rzY996UwdJn3lyYONecQVSKuaMfLwn8J93tOFAvzCpzIIZFoq516lvT1bj9aE5mIEkCQEYhuD79RLzT4oCn4csTJLqw2XUq1BZWJKh5GzBD6ErmvRg0wTCmV8FK34kb15g6dBwPqTJLBlGXYCwDO5ExKhXy9SQO5CbNEeQYpFMyBQtXxrWWix4MY1Nd0aGJfADGYlDriK4Mx4WrTq3bJNAQ7i7GClKVkJ7AdfUxC1v4dXnxXjM3hmAMQrN3FeObeSEkvQuppxzfVZ3IlIBYHVTrZOzdjD7FQB7rTXlZCoDRCgLPz1CEQlArUh3YWgWyuBQurKZmnAo6NGCGFzTZ84orvRwazQMYWsk4jaajeILdSSt46SNUlAY4IHQJ7D1Z1W9xO4z7HFlJbdUVJfCFdKz93L8WVYLUaqN3qIrX4sBv3fhF0nnpTOz"));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("The String must contain between 2 and 1000 characters"));
    }

    private boolean isPalindrome(String s) {

        exceptionsHandler(s);

        StringBuilder newString = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newString.append(Character.toLowerCase(c));
            }
        }
        return newString.toString().equals(newString.reverse().toString());
    }

    private static void exceptionsHandler(String s) {
        if (s == null) {
            throw new IllegalArgumentException("The String must not be null");
        }

        if (s.isEmpty()) {
            throw new IllegalArgumentException("The String must not be empty");
        }

        if (s.length() <= 1 || s.length() > 1000) {
            throw new IllegalArgumentException("The String must contain between 2 and 1000 characters");
        }
    }
}
