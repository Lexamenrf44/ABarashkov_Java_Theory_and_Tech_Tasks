package tech_tasks.array;

import helpers.*;
import java.util.*;

/*

Find previous value in sorted array calling a method

*/

public class FindPreviousIntViaMethodCallInSortedArray {

    public static void main(String[] args) {

        int[] arr = {8, 6, 10, 4, 2};

        Arrays.sort(arr);

        int maxIndex = arr.length - 1;

        int previousValue = HelpMethods.findPrevious(arr, maxIndex);

        if (previousValue == 8) {
            assert true;
            System.out.println("Test passed! The previous value is: " + previousValue);
        } else {
            assert false : "Test failed! Expected previous value to be 8, but got: " + previousValue;
        }
    }
}
