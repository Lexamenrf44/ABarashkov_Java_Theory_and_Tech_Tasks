package main.java.tech_tasks;

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

        // Convert the string to a stream of characters and count occurrences of each character
        Map<Character, Long> charCountMap = input.chars()
                // `input.chars()` converts the string into an IntStream of character ASCII codes.

                .mapToObj(c -> (char) c)
                // `mapToObj(c -> (char) c)` converts each ASCII code (int) into a Character object.

                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // `groupingBy(Function.identity(), Collectors.counting())` creates a map where each character (key)
        // is grouped by itself (`Function.identity()`), and the value is the count of its occurrences
        // (`Collectors.counting()`).

        System.out.println("Repeated characters:");
        // Prints the header before displaying the repeated characters.

        // Filter characters that appear more than once and print them
        charCountMap.entrySet().stream()
                // Converts the entry set of the map (key-value pairs of characters and their counts) into a stream
                // for further processing.

                .filter(entry -> entry.getValue() > 1)
                // Filters out the entries where the character count (value) is greater than 1, meaning the character
                // repeats at least once.

                .forEach(entry -> System.out.println(entry.getKey()));
        // For each entry in the filtered stream, prints the character (key) that appears more than once.
    }
}

