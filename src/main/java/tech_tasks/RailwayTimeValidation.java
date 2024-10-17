package tech_tasks;

import helpers.*;

/*

"Check if the given string is a correct time representation of the 24-hour clock"

*/

public class RailwayTimeValidation {
    public static void main(String[] args) {

        // Tests
        System.out.println(HelpMethods.validateRailwayTime("13:58")); // true
        System.out.println(HelpMethods.validateRailwayTime("25:51")); // false
        System.out.println(HelpMethods.validateRailwayTime("02:76")); // false
    }
}
