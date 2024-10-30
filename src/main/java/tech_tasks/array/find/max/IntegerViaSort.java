package tech_tasks.array.find.max;

import java.util.*;

/*

Find maximum value in array via sorting

*/

public class IntegerViaSort {

    public static void main(String[] args) {

        int[] arr = {4, 2, 9, 1, 5, 6};

        Arrays.sort(arr);

        int max = arr[arr.length - 1];

        if (max == 9) {
            assert true;
            System.out.println("Test passed! The maximum number is: " + max);
        } else {
            assert false : "Test failed! The maximum number is: " + max;
        }
    }
}
