package neetcode.find.duplicates;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindDuplicatesInArrayBooleanViaHashSetTests {

    @Test
    void emptyArray() {
        int[] arr = {};
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> hasDuplicates(arr));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Array cannot be empty"));

    }

    @Test
    void nullArray() {
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> hasDuplicates(null));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Array cannot be null"));

    }

    @Test
    void singleElementArray() {
        int[] arr = {1};
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> hasDuplicates(arr));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Array cannot be single element"));
    }

    @Test
    void multipleElementsArray() {
        int[] arr = {1, 2};
        assertFalse(hasDuplicates(arr));
    }

    @Test
    void duplicateElementsArray() {
        int[] arr = {1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertTrue(hasDuplicates(arr));
    }

    @Test
    void negativeElementsArray() {
        int[] arr = {-1, -2, -3, -4, -5, -6, -7, -5, -8, -9};
        assertTrue(hasDuplicates(arr));;
    }

    private boolean hasDuplicates(int[] arr) {
        exceptionHandler(arr);

        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (seen.contains(arr[i])) {
                return true;
            }
            seen.add(arr[i]);
        }
        return false;
    }

    private static void exceptionHandler(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        if (arr.length == 1) {
            throw new IllegalArgumentException("Array cannot be single element");
        }
    }
}
