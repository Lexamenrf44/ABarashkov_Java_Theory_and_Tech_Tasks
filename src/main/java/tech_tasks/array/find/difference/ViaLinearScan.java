package tech_tasks.array.find.difference;

import helpers.*;

/*

Find the difference between its maximum and minimum in array calling a linear scan method

*/

public class ViaLinearScan {

    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 8, 7};
        int target = 8;

        int difference = HelpMethods.findArrayDifferenceLinearScan(arr);

        if (difference == 8) {
            assert true;
            System.out.println("Test passed! Expected: " + difference);
        } else {
            assert false : "Test failed! Expected difference to be " + target + " but got " + difference;
        }
    }
}
