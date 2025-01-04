package tech_tasks.array.find.previous;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaxIndexViaLoop {

    @Test
    void emptyArrayTest() {
        int[] array = {};
        assertThrows(IllegalArgumentException.class, () -> findIndexOfSecondMaxInt(array));
    }

    @Test
    void singleElementArrayTest() {
        int[] array = {5};
        assertThrows(IllegalArgumentException.class, () -> findIndexOfSecondMaxInt(array));
    }

    @Test
    void twoElementsArrayTest() {
        int[] array = {5, 10};
        assertEquals(0, findIndexOfSecondMaxInt(array));
    }

    @Test
    void allSameElementsTest() {
        int[] array = {5, 5, 5};
        assertThrows(IllegalArgumentException.class, () -> findIndexOfSecondMaxInt(array));
    }

    @Test
    void negativeNumbersTest() {
        int[] array = {-5, -2, -8};
        assertEquals(0, findIndexOfSecondMaxInt(array));
    }

    @Test
    void zerosAndPositiveNumbersTest() {
        int[] array = {0, 1, 2, 0};
        assertEquals(1, findIndexOfSecondMaxInt(array));
    }

    @Test
    void repeatingAndDistinctElementsTest() {
        int[] array = {3, 3, 2, 1};
        assertEquals(2, findIndexOfSecondMaxInt(array));
    }

    @Test
    void sortedElementsTest() {
        int[] array = {3, 2, 1};
        Arrays.sort(array);

        int previous = array[array.length - 2];
        assertEquals(2, previous);
    }

    @Test
    void nullArrayTest() {
        assertThrows(IllegalArgumentException.class, () -> findIndexOfSecondMaxInt(null));
    }

    @Test
    void maxAtFirstPositionTest() {
        int[] array = {10, 5, 8, 7};
        assertEquals(2, findIndexOfSecondMaxInt(array));
    }

    @Test
    void maxAtLastPositionTest() {
        int[] array = {5, 8, 7, 10};
        assertEquals(1, findIndexOfSecondMaxInt(array));
    }

    @Test
    void duplicateMaxValuesTest() {
        int[] array = {10, 5, 10, 7};
        assertEquals(3, findIndexOfSecondMaxInt(array));
    }

    @Test
    void secondMaxAtFirstPositionTest() {
        int[] array = {8, 5, 10, 7};
        assertEquals(0, findIndexOfSecondMaxInt(array));
    }

    @Test
    void secondMaxAtLastPositionTest() {
        int[] array = {5, 10, 7, 8};
        assertEquals(3, findIndexOfSecondMaxInt(array));
    }

    @Test
    void largeNumbersTest() {
        int[] array = {Integer.MAX_VALUE, Integer.MAX_VALUE - 1, Integer.MAX_VALUE};
        assertEquals(1, findIndexOfSecondMaxInt(array));
    }

    @Test
    void mixedSignedNumbersTest() {
        int[] array = {-5, 10, -15, 8};
        assertEquals(3, findIndexOfSecondMaxInt(array));
    }

    public static int findIndexOfSecondMaxInt(int[] array) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)

        int firstMaxIndex = 0;

        // Null array handling
        if (array == null) {
            throw new IllegalArgumentException("Array should be not null");
        }

        // Single array element handling
        if (array.length < 2) {
            throw new IllegalArgumentException("Array should contain at least two elements");
        }

        // Find the first max index
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[firstMaxIndex]) {
                firstMaxIndex = i;
            }
        }

        // Find the second max index
        int secondMaxIndex = -1;
        int secondMaxValue = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[firstMaxIndex] && array[i] > secondMaxValue) {
                secondMaxValue = array[i];
                secondMaxIndex = i;
            }
        }

        // Duplicate handling
        if (secondMaxIndex == -1) {
            throw new IllegalArgumentException("Array should contain at least two different elements");
        }
        return secondMaxIndex;
    }
}
