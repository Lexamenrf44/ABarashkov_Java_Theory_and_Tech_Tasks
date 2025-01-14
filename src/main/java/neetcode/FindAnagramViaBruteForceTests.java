package neetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class FindAnagramViaBruteForceTests {

    @Test
    public void nullStringsTest() {
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> isAnagram(null, null));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Strings must not be null"));
    }

    @Test
    public void emptyStringsTest() {
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> isAnagram("", ""));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Strings must not be empty"));
    }

    @Test
    public void differentStringsLengthTest() {
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> isAnagram("abcd", "abcde"));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Strings must be of the same length"));
    }

    @Test
    public void capitalLettersStringsTest() {
        String s = "Hasahorn";
        String t = "Hosahorn";
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> isAnagram(s, t));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Strings must not contain uppercase characters"));
    }

    @Test
    public void capitalLetterStringTest() {
        String s = "ha";
        String t = "aH";
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> isAnagram(s, t));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Strings must not contain uppercase characters"));
    }

    @Test
    public void positiveCaseTest() {
        String s = "ha";
        String t = "ah";
        assertTrue(isAnagram(s, t));
    }

    @Test
    public void negativeCaseTest() {
        String s = "hasahorn";
        String t = "hosahorn";
        assertFalse(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {

        exceptionsHandler(s, t);

        validateString(s);
        validateString(t);

        char[] charArrayA = s.toCharArray();
        char[] charArrayB = t.toCharArray();

        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);

        if (Arrays.equals(charArrayA, charArrayB)) {
            return true;
        }
        return false;
    }

    private static void validateString(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                throw new IllegalArgumentException("Strings must not contain uppercase characters");
            }
        }
    }

    private static void exceptionsHandler(String s, String t) {
        if (s == null || t == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }

        if (s.isEmpty() || t.isEmpty()) {
            throw new IllegalArgumentException("Strings must not be empty");
        }

        if (s.length() != t.length()) {
            throw new IllegalArgumentException("Strings must be of the same length");
        }
    }
}
