package tech_tasks.array;

import helpers.*;

/*

Find maximum value in array calling a method

*/

public class FindMaxIntUsingBruteForce {

    public static void main(String[] args) {

        int[] arr = {7, 2, 11, 5, 3};

        int max = FindMaxMethods.findMaxBruteForce(arr);

        if (max == 10) {
            assert true;
            System.out.println("Test passed! The maximum number is: " + max);
        } else {
            assert false : "Test failed! The maximum number is: " + max;
        }
    }
}
