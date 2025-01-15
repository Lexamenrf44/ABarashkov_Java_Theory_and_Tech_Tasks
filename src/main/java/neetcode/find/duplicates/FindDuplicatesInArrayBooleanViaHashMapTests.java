package neetcode.find.duplicates;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class FindDuplicatesInArrayBooleanViaHashMapTests {

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
        assertFalse(hasDuplicates(arr));
    }

    @Test
    public void duplicateElementsArray() {
        int[] arr = {1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertTrue(hasDuplicates(arr));
    }

    @Test
    public void negativeElementsArray() {
        int[] arr = {-1, -2, -3, -4, -5, -6, -7, -5, -8, -9};
        assertTrue(hasDuplicates(arr));;
    }

    private boolean hasDuplicates(int[] nums) {
        exceptionHandler(nums);

        Map<Integer, Integer> duplicates = new HashMap<>();
        for (int num : nums) {
            if (duplicates.containsKey(num)) {
                return true;
            } else {
                duplicates.put(num, 1);
            }
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
