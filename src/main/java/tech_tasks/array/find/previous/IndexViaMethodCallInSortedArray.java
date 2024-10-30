package tech_tasks.array.find.previous;

import helpers.*;

import java.util.Arrays;

/*

Find index of previous value in sorted array calling a method

*/

public class IndexViaMethodCallInSortedArray {

    public static void main(String[] args) {

        int[] arr = {8, 6, 10, 4, 2};

        Arrays.sort(arr);

        int maxIndex = arr.length - 1;

        int previousValue = HelpMethods.findPrevious(arr, maxIndex);

        int previousIndex = Arrays.binarySearch(arr, previousValue);

        if (previousIndex == 3) {
            assert true;
            System.out.println("Test passed! The previous index is: " + previousIndex);
        } else {
            assert false : "Test failed! Expected previous index to be 3, but got: " + previousIndex;
        }
    }
}