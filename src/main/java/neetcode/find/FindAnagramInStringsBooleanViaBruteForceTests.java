package neetcode.find;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class FindAnagramInStringsBooleanViaBruteForceTests {

    @Test
    void nullStringsTest() {
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> findAnagram(null, null));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Strings must not be null"));
    }

    @Test
    void emptyStringsTest() {
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> findAnagram("", ""));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Strings must not be empty"));
    }

    @Test
    void differentStringsLengthTest() {
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> findAnagram("abcd", "abcde"));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Strings must be of the same length"));
    }

    @Test
    void capitalLettersStringsTest() {
        String s = "Hasahorn";
        String t = "Hosahorn";
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> findAnagram(s, t));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Strings must not contain uppercase characters"));
    }

    @Test
    void capitalLetterStringTest() {
        String s = "ha";
        String t = "aH";
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> findAnagram(s, t));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Strings must not contain uppercase characters"));
    }

    @Test
    void positiveCaseTest() {
        String s = "ha";
        String t = "ah";
        assertTrue(findAnagram(s, t));
    }

    @Test
    void negativeCaseTest() {
        String s = "hasahorn";
        String t = "hosahorn";
        assertFalse(findAnagram(s, t));
    }

    private static boolean findAnagram(String s, String t) {

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
