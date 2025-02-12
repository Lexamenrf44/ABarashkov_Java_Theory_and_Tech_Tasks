package tech_tasks.array.find.index;

import helpers.*;

/*

Find indices in array that add up to target value calling a hashmap method

*/

public class AddUpToTargetViaHashMapMethodCall {

    public static void main(String[] args) {

        int[] nums = {2, 11, 7, 15};
        int target = 9;

        int[] result = FindTwoSumMethods.findTwoSumHashMap(nums, target);

        if (result.length == 2) {
            assert true;
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            assert false : "No index found.";
        }
    }
}
