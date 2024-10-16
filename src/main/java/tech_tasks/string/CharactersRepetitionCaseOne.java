package main.java.tech_tasks.string;

import java.util.*;
import java.util.stream.Collectors;

/*

Describe a method that will display characters that repeat at least once using Stream API

*/

public class CharactersRepetitionCaseOne {
    public static void main(String[] args) {
        String input = "Hello World";
        displayRepeatedCharacters(input);
    }

    public static void displayRepeatedCharacters(String input) {

        // Step 1: Convert the input string to a list of characters.

        List<Character> characters = input.chars()   // Convert the string into an IntStream of character codes.
                .mapToObj(c -> (char) c)  // Convert each character code (int) to a Character object.
                .collect(Collectors.toList());  // Collect the characters into a List.

        // Step 2: Create a frequency map of characters.

        Map<Character, Long> charCountMap = characters.stream()  // Convert the List to a Stream of Characters.
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        // Group the characters by themselves and count how many times each character appears.

        // Step 3: Filter the map to keep only characters that repeat (count > 1).

        List<Character> repeatedChars = charCountMap.entrySet().stream()  // Convert the map entries (character, count) into a stream.
                .filter(entry -> entry.getValue() > 1)  // Filter out characters that appear more than once.
                .map(Map.Entry::getKey)  // Extract only the character (key) from each entry.
                .collect(Collectors.toList());  // Collect the result into a List of characters.

        // Step 4: Print out the repeated characters.
        System.out.println("Repeated characters: " + repeatedChars);
    }
}
