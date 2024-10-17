package theory.examples.other_key_java_classes;

/*

Enum

Represents a special class type for enumerating a fixed set of constants.
Useful when you need a predefined list of possible values, such as DAYS_OF_WEEK, COLORS, etc.

*/

public class Enum {
    // Define an enum for the days of the week
    enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
    }

    public static void main(String[] args) {
        // Assign a value to the enum
        Days today = Days.MONDAY;

        // Print the enum value
        System.out.println(today);  // Output: MONDAY
    }
}
