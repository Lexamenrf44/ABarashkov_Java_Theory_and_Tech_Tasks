package tech_tasks.array.find.max;

import helpers.FindMaxMethods;

/*

Find maximum value in array using Kadane's Algorithm

*/

public class IntegerViaKadaneAlgorithm {
    public static void main(String[] args) {
        int[] nums = {2, -7, 11, -15};
        int max = FindMaxMethods.findMaxSubArrayKadaneAlgo(nums);

        if (max == 11) {
            assert true;
            System.out.println("Test passed! Maximum sum of contiguous subarray: " + max);
        } else {
            assert false : "Test failed! Maximum sum of contiguous subarray: " + max;
        }
    }
}
