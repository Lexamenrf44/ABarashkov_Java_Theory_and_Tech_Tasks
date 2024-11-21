package tech_tasks.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/*

Describe a method that will display characters that repeat at least once using Stream API

*/

public class CharactersRepetitionCaseTwo {
    public static void main(String[] args) {
        String input = "Hello World";
        printRepeatedCharacters(input);
    }

    public static void printRepeatedCharacters(String input) {

        Map<Character, Long> charCountMap = input.chars()

                .mapToObj(c -> (char) c)
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Repeated characters:");

        charCountMap
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey()));
    }
}

