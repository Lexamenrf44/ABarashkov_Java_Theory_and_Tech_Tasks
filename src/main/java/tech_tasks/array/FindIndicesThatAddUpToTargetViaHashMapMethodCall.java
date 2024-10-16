package main.java.tech_tasks.array;

import main.java.helpers.*;

public class FindIndicesThatAddUpToTargetViaHashMapMethodCall {
    public static void main(String[] args) {

        // Example input
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the method and get the result
        int[] result = HelpMethods.findTwoSumHashMap(nums, target);

        // Output the result
        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}
