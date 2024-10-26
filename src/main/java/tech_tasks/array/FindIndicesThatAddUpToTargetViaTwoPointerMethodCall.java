package tech_tasks.array;

import helpers.HelpMethods;

public class FindIndicesThatAddUpToTargetViaTwoPointerMethodCall {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = HelpMethods.findTwoSumTwoPointerApproach(nums, target);

        if (target == 9) {
            assert true;
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            assert false : "No index found.";
        }
    }
}
