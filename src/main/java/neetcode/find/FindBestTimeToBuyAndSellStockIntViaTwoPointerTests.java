package neetcode.find;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindBestTimeToBuyAndSellStockIntViaTwoPointerTests {

    @Test
    void bestTimeToBuyAndSellStockTest() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 5;
        assertEquals(5, findProfit(prices));
    }

    @Test
    void nullArrayTest() {
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> findProfit(null));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("The array must not be null"));
    }

    @Test
    void emptyArrayTest() {
        int[] prices = {};
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> findProfit(prices));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("The array must not be empty"));
    }

    @Test
    void negativeArrayTest() {
        int[] prices = {-7, -2, 5, 3, 6, 4};
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> findProfit(prices));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Prices in array must be between 0 and 100"));
    }

    private int findProfit(int[] arr) {

        exceptionsHandler(arr);

        int l = 0;
        int r = 1;
        int maxProfit = 0;

        while (r < arr.length) {
            if (arr[l] < arr[r]) {
                int profit = arr[r] - arr[l];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                l = r;
            }
            r++;
        }
        return maxProfit;
    }

    private static void exceptionsHandler(int[] a) {

        if (a == null) {
            throw new IllegalArgumentException("The array must not be null");
        }

        if (a.length == 0) {
            throw new IllegalArgumentException("The array must not be empty");
        }

        if (a.length < 2 || a.length > 100) {
            throw new IllegalArgumentException("The array must be between 2 and 100");
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0 || a[i] > 100) {
                throw new IllegalArgumentException("Prices in array must be between 0 and 100");
            }
        }
    }
}
