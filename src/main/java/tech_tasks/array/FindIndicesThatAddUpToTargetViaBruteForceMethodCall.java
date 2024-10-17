package tech_tasks.array;

import helpers.*;

/*

Find indices in array that add up to target value calling a brute force method

*/

public class FindIndicesThatAddUpToTargetViaBruteForceMethodCall {
    public static void main(String[] args) {

        // Example input
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the method and get the result
        int[] result = HelpMethods.findTwoSumBruteForce(nums, target);

        // Output the result
        if (result.length == 2) {
            assert true;
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            assert false : "No index found.";
        }
    }
}
