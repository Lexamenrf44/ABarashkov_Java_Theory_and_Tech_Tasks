package tech_tasks.array.find.max;

import java.util.Arrays;

/*

Find index of maximum value in unsorted array using stream api

*/

public class IndexViaStreamApi {

    public static void main(String[] args) {

        int[] arr = {4, 2, 9, 1, 5, 6};

        int max = Arrays.stream(arr).max().getAsInt();

        int maxIndex = Arrays.binarySearch(arr, max);

        if (maxIndex == 2) {
            assert true;
            System.out.println("Test passed! The index is as expected: " + maxIndex);
        } else {
            assert false : "Test failed! Expected index to be 2, but got " + maxIndex;
        }
    }
}
