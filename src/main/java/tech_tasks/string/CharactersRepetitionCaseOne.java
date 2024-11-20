package tech_tasks.string;

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

        List<Character> characters = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        Map<Character, Long> charCountMap = characters.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        List<Character> repeatedChars = charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Repeated characters: " + repeatedChars);
    }
}
