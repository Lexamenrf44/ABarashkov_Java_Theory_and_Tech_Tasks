package tech_tasks.string;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
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
        assertThat(filterOutCharCFromStringArray(array)).contains("A", "B", "D", "E", null, "F");
    }

    @Test
    void arrayWithNoCCharactersTest() {
        String[] array = {"A", "B", "D", "E", null, ""};
        assertThat(filterOutCharCFromStringArray(array)).contains("A", "B", "D", "E", null, "");
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
