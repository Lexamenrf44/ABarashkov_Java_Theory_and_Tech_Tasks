package tech_tasks.array.find.max;

import java.util.Arrays;

public class IndexViaStreamApi {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 1, 5, 6};

        for (int i = 0; i < arr.length; i++) {}
        System.out.println(findMaxIndexViaLinearScan(arr));
    }

    static int findMaxIndexViaLinearScan(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int max = Arrays.stream(arr).max().getAsInt();

        return Arrays.binarySearch(arr, max);
    }
}
