package tech_tasks.array.find.index;

import helpers.*;

/*

Find indices in array that add up to target value calling a brute force method

*/

public class AddUpToTargetViaBruteForceMethodCall {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = FindTwoSumMethods.findTwoSumBruteForce(nums, target);

        if (result.length == 2) {
            assert true;
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            assert false : "No index found.";
        }
    }
}
