package helpers;

public class HelpMethods {

    public static void printFizzBuzzWithCounter() {

        int fizzCount = 0;
        int buzzCount = 0;
        int fizzBuzzCount = 0;

        for (int i = 0; i <= 50; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("main.java.tech_tasks.FizzBuzz");
                fizzBuzzCount++;

            } else if (i % 3 == 0) {

                System.out.println("Fizz");
                fizzCount++;

            } else if (i % 5 == 0) {

                System.out.println("Buzz");
                buzzCount++;

            } else {
                System.out.println(i);
            }

            System.out.println("\nSummary:");
            System.out.println("Fizz was printed " + fizzCount + " times.");
            System.out.println("Buzz was printed " + buzzCount + " times.");
            System.out.println("FizzBuzz was printed " + fizzBuzzCount + " times.");
        }
    }

    public static int findPrevious(int[] array, int index) {
        if (index > 0) {
            return array[index - 1];
        } else {
            return -1;
        }
    }

    public static boolean validateRailwayTime(String time) {

        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));

        return hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59;
    }

    public static boolean validateStandardTime(String time) {

        return (time.length() == 5) &&
                (time.charAt(2) == ':') &&
                (Integer.parseInt(time.substring(0, 2)) >= 1 && Integer.parseInt(time.substring(0, 2)) <= 12) && // Valid hours (01-12)
                (Integer.parseInt(time.substring(3, 5)) >= 0 && Integer.parseInt(time.substring(3, 5)) <= 59); // Valid minutes (00-59)
    }

    public static int findArrayDifferenceLinearScan(int[] inputArray)  {

        int indexOfMinimum = 0;
        int indexOfMaximum = 0;

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < inputArray[indexOfMinimum]) {
                indexOfMinimum = i;
            }
            if (inputArray[i] > inputArray[indexOfMaximum]) {
                indexOfMaximum = i;
            }
        }
        return inputArray[indexOfMaximum] - inputArray[indexOfMinimum];
    }
}
