package tech_tasks.string;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FilterCharCFromListViaStreamApiSolution {

    @Test
    void nullArrayTest() {
        String[] array = null;
        assertThrows(IllegalArgumentException.class, () -> filterOutCharCFromStringArray(array));
    }

    @Test
    void emptyArrayTest() {
        String[] array = {};
        assertThat(filterOutCharCFromStringArray(array)).isEmpty();
    }

    @Test
    void arrayWithOnlyCCharactersTest() {
        String[] array = {"C", " c ", "C ", " c", " C", "C"};
        assertThat(filterOutCharCFromStringArray(array)).isEmpty();
    }

    @Test
    void arrayWithMixedCharactersTest() {
        String[] array = {"A", "B", "C", " c", "D", "E", "C", null, "F"};
        List<String> expected = Arrays.asList("A", "B", "D", "E", null, "F");
        assertEquals(expected, filterOutCharCFromStringArray(array));
    }

    @Test
    void arrayWithNoCCharactersTest() {
        String[] array = {"A", "B", "D", "E", null, ""};
        List<String> expected = Arrays.asList("A", "B", "D", "E", null, "");
        assertEquals(expected, filterOutCharCFromStringArray(array));
    }

    @Test
    void arrayWithElementsContainingCCharactersTest() {
        String[] array = {"AbraCadabra", "Baracuda", "Cadmium", "D", "E", "F", "", " ", null, "C", "C ", " C ", " C", "c", "c ", " c ", " c"};
        List<String> expected = Arrays.asList("AbraCadabra", "Baracuda", "Cadmium", "D", "E", "F", "", " ", null);
        assertEquals(expected, filterOutCharCFromStringArray(array));
    }

    public static List<String> filterOutCharCFromStringArray(String[] array) {

        if (array == null) {
            throw new IllegalArgumentException("Input array cannot be null.");
        }

        return Arrays.stream(array)
                .filter(c -> c == null || !c.trim().equalsIgnoreCase("C"))
                .collect(Collectors.toList());
    }
}
