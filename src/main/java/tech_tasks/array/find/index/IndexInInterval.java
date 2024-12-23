package tech_tasks.array.find.index;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IndexInInterval {

    @Test
    void validRangeAndTargetPresentTest() {
        int[] array = {1, 2, 3, 4, 5};
        int a = 1, b = 4, target = 3;
        assertEquals(2, findIndexInRange(array, a, b, target));
    }

    @Test
    void targetAtStartOfRangeTest() {
        int[] array = {1, 2, 3, 4, 5};
        int a = 0, b = 3, target = 1;
        assertEquals(0, findIndexInRange(array, a, b, target));
    }

    @Test
    void targetAtEndOfRangeTest() {
        int[] array = {10, 20, 30, 40};
        int a = 1, b = 4, target = 40;
        assertEquals(3, findIndexInRange(array, a, b, target));
    }

    @Test
    void targetNotInRangeTest() {
        int[] array = {1, 2, 3, 4, 5};
        int a = 1, b = 4, target = 5;
        assertEquals(-1, findIndexInRange(array, a, b, target));
    }

    @Test
    void targetAbsentInArrayTest() {
        int[] array = {1, 2, 3, 4, 5};
        int a = 0, b = 5, target = 6;
        assertEquals(-1, findIndexInRange(array, a, b, target));
    }

    @Test
    void negativeNumbersInArrayTest() {
        int[] array = {-10, -20, -30, -40};
        int a = 1, b = 4, target = -30;
        assertEquals(2, findIndexInRange(array, a, b, target));
    }

    @Test
    void emptyArrayTest() {
        int[] array = {};
        int a = 0, b = 0, target = 1;
        assertThrows(IllegalArgumentException.class, () -> findIndexInRange(array, a, b, target));
    }

    @Test
    void invalidRangeNegativeStartTest() {
        int[] array = {1, 2, 3};
        int a = -1, b = 2, target = 2;
        assertThrows(IllegalArgumentException.class, () -> findIndexInRange(array, a, b, target));
    }

    @Test
    void invalidRangeExceedsLength() {
        int[] array = {1, 2, 3};
        int a = 1, b = 5, target = 3;
        assertThrows(IllegalArgumentException.class, () -> findIndexInRange(array, a, b, target));
    }

    @Test
    void invalidRangeStartEqualsEnd() {
        int[] array = {1, 2, 3};
        int a = 2, b = 2, target = 3;
        assertThrows(IllegalArgumentException.class, () -> findIndexInRange(array, a, b, target));
    }

    @Test
    void rangeCoversEntireArray() {
        int[] array = {1, 2, 3, 4, 5};
        int a = 0, b = array.length, target = 4;
        assertEquals(3, findIndexInRange(array, a, b, target)); // Index of 4 is 3
    }

    public static int findIndexInRange(int[] array, int a, int b, int target) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        if (a < 0) {
            throw new IllegalArgumentException("Start index 'a' cannot be negative.");
        }

        if (b > array.length) {
            throw new IllegalArgumentException("End index 'b' cannot exceed array length.");
        }

        if (a >= b) {
            throw new IllegalArgumentException("Start index 'a' must be less than end index 'b'.");
        }

        for (int i = a; i < b; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
