package tech_tasks.array.find.max;

import java.util.*;

/*

Find index of maximum value in sorted array using stream api

*/

public class IndexViaSortUsingStreamApi {

    public static void main(String[] args) {

        int[] arr = {4, 2, 9, 1, 5, 6};
        int max = Arrays.stream(arr).max().getAsInt();

        Arrays.sort(arr);

        int maxIndex = Arrays.binarySearch(arr, max);

        if (maxIndex == 5) {
            assert true;
            System.out.println("Test passed! The index of the maximum number is: " + maxIndex);
        } else {
            assert false : "Test failed! Expected index to be 5, but got " + maxIndex;
        }
    }
}
