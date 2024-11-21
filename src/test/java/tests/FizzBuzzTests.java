package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Fizz Buzz task")
@Epic("Java Fundamentals")
@Feature("Fizz Buzz")
public class FizzBuzzTests {

    @Test
    @DisplayName("Should print fizz buzz via if else approach")
    void shouldPrintFizzBuzzViaIfElseApproach() {
        printFizzBuzzWithIfElse(50);
    }

    @Test
    @DisplayName("Should print fizz buzz via switch case approach")
    void shouldPrintFizzBuzzViaSwitchCaseApproach() {
        printFizzBuzzWithSwitchCase(50);
    }

    public static void printFizzBuzzWithIfElse(int limit) {
        for (int i = 0; i <= limit; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void printFizzBuzzWithSwitchCase(int limit) {
        for (int i = 0; i <= limit; i++) {
            int caseKey = (i % 3 == 0 ? 1 : 0) + (i % 5 == 0 ? 2 : 0);

            switch (caseKey) {
                case 3 -> System.out.println("FizzBuzz");
                case 1 -> System.out.println("Fizz");
                case 2 -> System.out.println("Buzz");
                default -> System.out.println(i);
            }
        }
    }
}
