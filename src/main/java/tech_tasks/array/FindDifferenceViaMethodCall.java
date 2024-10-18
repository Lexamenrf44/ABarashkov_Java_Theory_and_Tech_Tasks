package tech_tasks.array;

import helpers.*;

/*

Find the difference between its maximum and minimum elements in array calling a method

*/

public class FindDifferenceViaMethodCall {

    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 8, 7};
        int target = 8;

        int difference = HelpMethods.CalculateArrayDifference(arr);

        if (difference == 8) {
            assert true;
            System.out.println("Test passed! Expected: " + difference);
        } else {
            assert false : "Test failed! Expected difference to be " + target + " but got " + difference;
        }
    }
}
