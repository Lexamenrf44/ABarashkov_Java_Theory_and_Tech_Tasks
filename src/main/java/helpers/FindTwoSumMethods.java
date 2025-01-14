package helpers;

import java.util.HashMap;

public class FindTwoSumMethods {

    public static int[] findTwoSumHashMap(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static int[] findTwoSumBruteForce(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static int[] findTwoSumTwoPointerApproach(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int currentSum = nums[left] + nums[right];
            if (currentSum == target) {
                return new int[]{left + 1, right + 1};
            }
            else if (currentSum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        return new int[]{};
    }
}
