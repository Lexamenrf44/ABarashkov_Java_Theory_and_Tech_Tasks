package tech_tasks.array.find.index;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySolution {

    @Test
    public void testElementFound() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int result = binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(6, result, "Индекс элемента 7 должен быть 6.");
    }

    @Test
    public void testElementNotFound() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 11;
        int result = binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(-1, result, "Элемент 11 не должен быть найден.");
    }

    @Test
    public void testSingleElementArrayFound() {
        int[] array = {5};
        int target = 5;
        int result = binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(0, result, "Индекс элемента 5 должен быть 0.");
    }

    @Test
    public void testSingleElementArrayNotFound() {
        int[] array = {5};
        int target = 10;
        int result = binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(-1, result, "Элемент 10 не должен быть найден.");
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        int target = 1;
        int result = binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(-1, result, "Для пустого массива элемент не должен быть найден.");
    }

    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        if (left > right) { return -1;}

        int mid = left + (right - left) / 2;

        if (array[mid] == target) { return mid;}

        if (target < array[mid]) {
            return binarySearchRecursive(array, target, left, mid - 1);
        } else {
            return binarySearchRecursive(array, target, mid + 1, right);
        }
    }
}
