package tech_tasks.array.find.equal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IndicesTrueFalseSearch {

    @Test
    public void emptyArray() {
        int[] arr = {};
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> findDuplicatesInArray(arr));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Array cannot be empty"));

    }

    @Test
    public void nullArray() {
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> findDuplicatesInArray(null));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Array cannot be null"));

    }

    @Test
    public void singleElementArray() {
        int[] arr = {1};
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> findDuplicatesInArray(arr));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Array cannot be single element"));
    }

    @Test
    public void multipleElementsArray() {
        int[] arr = {1, 2};
        assertFalse(findDuplicatesInArray(arr));
    }

    @Test
    public void duplicateElementsArray() {
        int[] arr = {1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertTrue(findDuplicatesInArray(arr));
    }

    @Test
    public void negativeElementsArray() {
        int[] arr = {-1, -2, -3, -4, -5, -6, -7, -5, -8, -9};
        assertTrue(findDuplicatesInArray(arr));
    }

    public boolean findDuplicatesInArray(int[] arr) {
        exceptionHandler(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
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
