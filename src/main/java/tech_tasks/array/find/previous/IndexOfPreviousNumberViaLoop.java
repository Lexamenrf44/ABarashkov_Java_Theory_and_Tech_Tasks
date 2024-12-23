package tech_tasks.array.find.previous;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IndexOfPreviousNumberViaLoop {

    @Test
    void emptyArrayTest() {
        int[] array = {};
        assertThrows(IllegalArgumentException.class, () -> findIndexOfPrevious(array));
    }

    @Test
    void singleElementArrayTest() {
        int[] array = {5};
        assertThrows(IllegalArgumentException.class, () -> findIndexOfPrevious(array));
    }

    @Test
    void twoElementsArrayTest() {
        int[] array = {5, 10};
        assertEquals(0, findIndexOfPrevious(array));
    }

    @Test
    void allSameElementsTest() {
        int[] array = {5, 5, 5};
        assertEquals(1, findIndexOfPrevious(array));
    }

    @Test
    void negativeNumbersTest() {
        int[] array = {-5, -2, -8};
        assertEquals(0, findIndexOfPrevious(array));
    }

    @Test
    void zerosAndPositiveNumbersTest() {
        int[] array = {0, 1, 2, 0};
        assertEquals(1, findIndexOfPrevious(array));
    }

    @Test
    void repeatingAndDistinctElementsTest() {
        int[] array = {3, 3, 2, 1};
        assertEquals(1, findIndexOfPrevious(array));
    }

    @Test
    void sortedElementsTest() {
        int[] array = {3, 2, 1};
        Arrays.sort(array);

        int previous = array[array.length - 2];
        assertEquals(2, previous);
    }

    public static int findIndexOfPrevious(int[] array) {

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        int maxIndex = 0;
        int previousIndex = -1;

        if (array == null) {
            throw new IllegalArgumentException("Array should contain at least two elements");
        }

        if (array.length < 2) {
            throw new IllegalArgumentException("Array should contain at least two elements");
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                previousIndex = maxIndex;
                maxIndex = i;
            }
            else if (previousIndex == -1 || array[i] > array[previousIndex]) {
                previousIndex = i;
            }
        }

        if (previousIndex == -1) {
            throw new IllegalArgumentException("Array should contain at least two different elements");
        }
        System.out.println(previousIndex);
        return previousIndex;
    }
}
