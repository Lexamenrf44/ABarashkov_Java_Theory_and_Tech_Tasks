package neetcode.find.duplicates;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindDuplicatesInArrayIntViaBruteForceTests {

    @Test
    public void emptyArray() {
        int[] arr = {};
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> hasDuplicates(arr));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Array cannot be empty"));

    }

    @Test
    public void nullArray() {
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> hasDuplicates(null));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Array cannot be null"));

    }

    @Test
    public void singleElementArray() {
        int[] arr = {1};
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> hasDuplicates(arr));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Array cannot be single element"));
    }

    @Test
    public void multipleElementsArray() {
        int[] arr = {1, 2};
        int[] expected = {};
        assertArrayEquals(expected, hasDuplicates(arr));
    }

    @Test
    public void duplicateElementsArray() {
        int[] arr = {1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = {1};
        assertArrayEquals(expected, hasDuplicates(arr));
    }

    @Test
    public void negativeElementsArray() {
        int[] arr = {-1, -2, -3, -4, -5, -6, -7, -5, -8, -9};
        int[] expected = {-5};
        assertArrayEquals(expected, hasDuplicates(arr));
    }


    private int[] hasDuplicates(int[] arr) {

        exceptionHandler(arr);

        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !duplicates.contains(arr[i])) {
                    duplicates.add(arr[i]);
                }
            }
        }
        return duplicates.stream().mapToInt(Integer::intValue).toArray();
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
