package tech_tasks.array;

import helpers.FindTwoSumMethods;

public class FindIndicesThatAddUpToTargetViaTwoPointerMethodCall {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = FindTwoSumMethods.findTwoSumTwoPointerApproach(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
            assert true;
        } else {
            assert false : "No indices found.";
        }
    }
}
