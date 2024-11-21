package helpers;

public class FindMaxMethods {
    public static int findMaxBruteForce(int[] array) {

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMaxSubArrayKadaneAlgo(int[] nums) {

        int currentSum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            max = Math.max(max, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return max;
    }
}
