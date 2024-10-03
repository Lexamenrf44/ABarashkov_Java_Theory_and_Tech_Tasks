package tech_tasks;

public class FizzBuzz {
    public static void main(String[] args) {
        printFizzBuzz();
    }

    public static void printFizzBuzz() {
        for (int i = 0; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("tech_tasks.FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}