package neetcode.find;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class FindTwoSumViaHashMapTests {

    @Test
    void emptyArrayTest() {
        int[] arr = {};
        int target = 9;
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> findTwoSum(arr, target));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Array length must be between 2 and 1000."));
    }

    @Test
    void nullArrayTest() {
        int target = 9;
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> findTwoSum(null, target));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Array length must be between 2 and 1000."));
    }

    @Test
    void baseTest() {
        int[] arr = {8, 9, 2, 1};
        int target = 9;
        int[] expected = {0, 3};
        assertArrayEquals(expected, findTwoSum(arr, target));
    }

    @Test
    void emptyTargetTest() {
        int[] arr = {8, 9, 2, 1};
        int target = 0;
        int[] expected = {};
        assertArrayEquals(expected, findTwoSum(arr, target));
    }

    @Test
    void negativeArrayTest() {
        int[] arr = {-10, -5, -4, -3, -2, -1};
        int target = -5;
        int[] expected = {3, 4};
        assertArrayEquals(expected, findTwoSum(arr, target));
    }
    
    @Test
    void arrayBoundaryValuesTest() {
        int[] arr = {10_000_001, 1, 2, 3};
        int target = 3;
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> findTwoSum(arr, target));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Array elements must be between -10,000,000 and 10,000,000."));
    }

    @Test
    void targetBoundaryValuesTest() {
        int[] arr = {10_000_000, 1};
        int target = 10_000_001;
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> findTwoSum(arr, target));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Target must be between -10,000,000 and 10,000,000."));
    }

    private static int[] findTwoSum(int[] nums, int target) {

        exceptionHandler(nums, target);

        Map<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null) {
                return new int[] {complementIndex, i};
            }
            complements.put(target - nums[i], i);
        }
        return new int[0];
    }

    private static void exceptionHandler(int[] nums, int target) {
        if (nums == null || nums.length < 2 || nums.length > 1000) {
            throw new IllegalArgumentException("Array length must be between 2 and 1000.");
        }

        for (int num : nums) {
            if (num < -10_000_000 || num > 10_000_000) {
                throw new IllegalArgumentException("Array elements must be between -10,000,000 and 10,000,000.");
            }
        }

        if (target < -10_000_000 || target > 10_000_000) {
            throw new IllegalArgumentException("Target must be between -10,000,000 and 10,000,000.");
        }
    }
}
