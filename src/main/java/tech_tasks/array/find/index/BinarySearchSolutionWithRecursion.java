package tech_tasks.array.find.index;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinarySearchSolutionWithRecursion {

    @Test
    public void firstElementTest() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 1;
        int result = binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(0, result, "Индекс первого элемента должен быть 0.");
    }

    @Test
    public void elementFoundTest() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int result = binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(6, result, "Индекс элемента 7 должен быть 6.");
    }

    @Test
    public void indexLowerTest() {
        int[] array = {1, 2};
        int target = 1;
        int result = binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(0, result, "Индекс элемента 7 должен быть 6.");
    }

    @Test
    public void lastElementTest() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 5;
        int result = binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(4, result, "Индекс последнего элемента должен быть 4.");
    }

    @Test
    public void duplicateElementsTest() {
        int[] array = {1, 2, 2, 3, 4};
        int target = 2;
        int result = binarySearchRecursive(array, target, 0, array.length - 1);
        assertTrue(result == 1 || result == 2, "Индекс элемента 2 должен быть 1 или 2.");
    }

    @Test
    public void elementNotFoundTest() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 11;
        int result = binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(-1, result, "Элемент 11 не должен быть найден.");
    }

    @Test
    public void singleElementArrayFoundTest() {
        int[] array = {5};
        int target = 5;
        int result = binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(0, result, "Индекс элемента 5 должен быть 0.");
    }

    @Test
    public void singleElementArrayNotFoundTest() {
        int[] array = {5};
        int target = 10;
        int result = binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(-1, result, "Элемент 10 не должен быть найден.");
    }

    @Test
    public void emptyArrayTest() {
        int[] array = {};
        int target = 1;
        int result = binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(-1, result, "Для пустого массива элемент не должен быть найден.");
    }

    @Test
    public void negativeNumbersTest() {
        int[] array = {-10, -5, 0, 5, 10};
        int target = -5;
        int result = binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(1, result, "Индекс элемента -5 должен быть 1.");
    }

    @Test
    public void largeArrayTest() {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        int target = 999;
        int result = binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(998, result, "Индекс элемента 999 должен быть 998.");
    }

    @Test
    public void oddLengthArrayTest() {
        int[] array = {1, 3, 5, 7, 9};
        int target = 7;
        int result = binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(3, result, "Индекс элемента 7 должен быть 3.");
    }

    @Test
    public void evenLengthArrayTest() {
        int[] array = {1, 3, 5, 7};
        int target = 5;
        int result = binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(2, result, "Индекс элемента 5 должен быть 2.");
    }

    public static int binarySearchRecursive(int[] array, int targetValue, int leftIndex, int rightIndex) {

        // Пошаговый алгоритм:
        // Найти середину массива.
        // Сверить искомое значение и середину массива. Если они равны - вернуть индекс середины массива.
        // Если искомое значение меньше середины массива - продолжить поиск в левой части массива.
        // Иначе продолжить поиск в правой части массива.
        // Если массив закончился, то вернуть -1

        if (array.length == 0) {
            return -1;
        }

//        System.out.println("LeftIndex: " + leftIndex + " RightIndex: " + rightIndex);

        // Before
        // int midIndex = (leftIndex + rightIndex + 1) / 2;
        // формула добавляет лишнюю единицу, что приводит к смещению среднего индекса
        // не учитывала риск переполнения

        // After
        int midIndex = leftIndex + (rightIndex - leftIndex) / 2;
//        System.out.println("midIndex: " + midIndex);

        // Before
        // if (midIndex == rightIndex && midIndex != leftIndex + 1) {
        //    return -1;
        // }
        // проверка не учитывает, что рекурсия должна завершаться, если диапазон стал недействительным
        // могут быть пропущены корректные индексы.

        // After
        if (leftIndex > rightIndex) {
            return -1;
        }

        if (targetValue == array[midIndex]) {
            return midIndex;
        }

        if (targetValue < array[midIndex]) {
//            System.out.println("LeftIndex: " + leftIndex);
        // Before
        // return binarySearchRecursive(array, targetValue, leftIndex, midIndex);
        // не уменьшали диапазон поиска

        // After
            return binarySearchRecursive(array, targetValue, leftIndex, midIndex - 1);
        }

        if (targetValue > array[midIndex]) {
//            System.out.println("RightIndex: " + rightIndex);
        // Before
        // return binarySearchRecursive(array, targetValue, midIndex, rightIndex);
        // не уменьшали диапазон поиска

        // After
            return binarySearchRecursive(array, targetValue, midIndex + 1, rightIndex);
        }
        return -1;
    }
}
