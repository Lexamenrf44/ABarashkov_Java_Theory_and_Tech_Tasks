package neetcode.find;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class FindValidParenthesesBooleanViaStackTests {

    @Test
    void validSingleParentheses() {
        String s = "[]";
        assertTrue(isValidParentheses(s));
    }

    @Test
    void validNeighbouringParentheses() {
        String s = "{}[]()";
        assertTrue(isValidParentheses(s));
    }

    @Test
    void validMultipleParenthesesTest() {
        String s = "[{()}]";
        assertTrue(isValidParentheses(s));
    }

    @Test
    void invalidSingleOpeningParentheses() {
        String s = "[";
        assertFalse(isValidParentheses(s));
    }

    @Test
    void invalidSingleClosingParentheses() {
        String s = "}";
        assertFalse(isValidParentheses(s));
    }

    @Test
    void invalidNeighbouringParentheses() {
        String s = "{[]()";
        assertFalse(isValidParentheses(s));
    }

    @Test
    void invalidMultipleParenthesesTest() {
        String s = "[{()]";
        assertFalse(isValidParentheses(s));
    }

    @Test
    void nullStringTest() {
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> isValidParentheses(null));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("The String must not be null"));
    }

    @Test
    void emptyStringTest() {
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> isValidParentheses(""));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("The String must not be empty"));
    }

    @Test
    void outOfUpperBoundariesStringTest() {
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> isValidParentheses("{JmvVsU1KcUjTtB7OOQE3i4ugUcPZCkZYirBX7W0f6EO32IUTMoptAIUZFYRDfXvHtBqkd79BX70NqTycZNkm62Qz0i6lwrz3dVnD853ctMqYILNfhoGOeUB9AxjNuOKURqQGMzjL8QOap0lcxd8f95tGZ5spNmiyGdh9pzbvb1LpQLAkH6DDkplQbS1P7GL9jJiia9VAjWaqs1edhrgp7rTWJfXEcb4lFzaCXLHHDh3sMcHO0JSTgRQRSN7TEhpAfW8xQBo9yQ9aRuypBEHlOwN0NWT62rwqXgAdBPFg0RcdKq12hhPitSjqhbSst8a2fdZW1JHdp0io44rx2egUqqOmpvBxGssbiIT2YsAcls9ebF13brY5aMuOMj16pHDRrYHcoRpaufiDKTXvRMcGdqLAHdONxgHwlGs8zsg4qhIP99GzDtUnMUjZGXHajJfJQWfBu8ARYEN6HAKoJKdvflMMtcMeVbOnYwPTVJyTTxQ6KyTcjGZELnttixVDlPkbo1H0xKIjmaHGXt5hUYb7B4h2KgEfBojt7zOtHWtrMoBRgDKl8b2rzY996UwdJn3lyYONecQVSKuaMfLwn8J93tOFAvzCpzIIZFoq516lvT1bj9aE5mIEkCQEYhuD79RLzT4oCn4csTJLqw2XUq1BZWJKh5GzBD6ErmvRg0wTCmV8FK34kb15g6dBwPqTJLBlGXYCwDO5ExKhXy9SQO5CbNEeQYpFMyBQtXxrWWix4MY1Nd0aGJfADGYlDriK4Mx4WrTq3bJNAQ7i7GClKVkJ7AdfUxC1v4dXnxXjM3hmAMQrN3FeObeSEkvQuppxzfVZ3IlIBYHVTrZOzdjD7FQB7rTXlZCoDRCgLPz1CEQlArUh3YWgWyuBQurKZmnAo6NGCGFzTZ84orvRwazQMYWsk4jaajeILdSSt46SNUlAY4IHQJ7D1Z1W9xO4z7HFlJbdUVJfCFdKz93L8WVYLUaqN3qIrX4sBv3fhF0nnpTOz}"));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("The String must contain between 2 and 1000 characters"));
    }

    private boolean isValidParentheses(String s) {

        exceptionHandler(s);

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((c == ')' && top == '(') ||
                    (c == '}' && top == '{') ||
                    (c == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static void exceptionHandler(String s) {
        if (s == null) {
            throw new IllegalArgumentException("The String must not be null");
        }

        if (s.isEmpty()) {
            throw new IllegalArgumentException("The String must not be empty");
        }

        if (s.length() < 1 || s.length() > 1000) {
            throw new IllegalArgumentException("The String must contain between 2 and 1000 characters");
        }
    }
}
