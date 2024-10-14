package main.java.tech_tasks;

import main.java.helpers.*;

/*

"Check if the given string is a correct time representation of the 12-hour clock"

*/

public class StandardTimeValidation {
    public static void main(String[] args) {

        // Test cases
        System.out.println(HelpMethods.validateStandardTime("12:30")); // true (valid)
        System.out.println(HelpMethods.validateStandardTime("01:15")); // true (valid)
        System.out.println(HelpMethods.validateStandardTime("00:45")); // false (invalid hour)
        System.out.println(HelpMethods.validateStandardTime("13:00")); // false (invalid hour)
        System.out.println(HelpMethods.validateStandardTime("11:60")); // false (invalid minute)
    }
}
