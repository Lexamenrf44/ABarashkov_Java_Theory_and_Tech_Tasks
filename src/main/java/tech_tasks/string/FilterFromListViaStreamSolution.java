package tech_tasks.string;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class FilterFromListViaStreamSolution {
    public static void main(String[] args) {

        String[] characters = {"A", "B", "C", "C ", " C ", " C", "c", "c ", " c ", " c", "D", "E", "F", "G", null, "", "Cadmium", " ", "microphone", "AbraCadabra"};

        String[] allChars = {"A", "B", "C ", " C ", " C", "c", "c ", " c ", " c", "D", "E", "F", "G", null, "", "Cadmium", " ", "microphone", "AbraCadabra"};

        for (String chars : allChars) {
            Assertions.assertTrue(filterSingleCElement(chars));
            System.out.println(chars);
        }

//        filterCElements(characters);
//        filterAllSeparateCElements(characters);
//        filterAllSeparateElementsContainingC(characters);
    }

    static boolean filterSingleCElement(String element) {
        return element == null || !Objects.equals(element.trim().toLowerCase(), "C");
    }

    static void filterCElements(String[] input) {
        List<String> characters = Arrays.asList(input);

        characters
                .stream()
                .filter(s -> !Objects.equals(s, "C"))
                .forEach(System.out::println);
    }

    static void filterAllSeparateCElements(String[] input) {
        List<String> characters = Arrays.asList(input);

        characters
                .stream()
                .filter(s -> s == null || !Objects.equals(s.trim().toUpperCase(), "C"))
                .forEach(System.out::println);
    }

    static void filterAllSeparateElementsContainingC(String[] input) {
        List<String> characters = Arrays.asList(input);

        characters
                .stream()
                .filter(s -> s == null || !Objects.equals(s.toLowerCase().contains("c"), true))
                .forEach(System.out::println);
    }
}
