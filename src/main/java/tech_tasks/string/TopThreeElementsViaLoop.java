package tech_tasks.string;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class TopThreeElementsViaLoop {

    // Нужно вернуть топ 3 символа по количеству вхождений в строку,
    //
    // если в топ 3 попадут несколько символов с одинаковым количеством вхождений - вернуть их все.
    //
    // Например: "aaabbccdd" - ответ должен быть [a, b, c, d] потому что в топ 3 символа d тоже входит так как у него тоже 2 вхождения как и у b, c.

    @Test
    void emptyStringTest() {
        String emptyString = "";
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> findTopThreeElements(emptyString));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("String cannot be empty"));
    }

    @Test
    void nullElementTest() {
        String nullElementString = null;
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> findTopThreeElements(nullElementString));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("String cannot be null"));
    }

    @Test
    void oneElementTest() {
        String oneElementString = "a";
        assertEquals("a", findTopThreeElements(oneElementString));
    }

    @Test
    void duplicatedElementsTest() {
        String duplicateElementsString = "aabbccdd";
        assertEquals("a, b, c, d", findTopThreeElements(duplicateElementsString));
    }

    @Test
    void topThreeElementsTest() {
        String someElementsDuplicatedString = "aaaaabbbbccc";
        assertEquals("a, b, c", findTopThreeElements(someElementsDuplicatedString));
    }

    @Test
    void outOfTopElementTest() {
        String someElementsDuplicatedString = "aaaaabbbbcccdd";
        assertEquals("a, b, c", findTopThreeElements(someElementsDuplicatedString));
    }

    public static String findTopThreeElements(String text) {

        Map<String, Integer> map = new HashMap<>();

        String result = "";
        
        // Null array handling
        if (text == null) {
            throw new IllegalArgumentException("String cannot be null");
        }

        // Single array element handling
        if (text.length() < 1) {
            throw new IllegalArgumentException("String cannot be empty");
        }

        String[] symbols = text.split("");

        // for (String symbol : symbols) { //enhanced form = forEach
        for (int i = 0; i < symbols.length; i++) {
            if (map.containsKey(symbols[i])) {
                map.replace(symbols[i], map.get(symbols[i]) + 1);
            } else {
                map.put(symbols[i], 1);
            }
        }

        // Доработка: сортируем map по значению (по количеству вхождений)
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(map.entrySet());
        sortedEntries.sort((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue())); // Убывающий порядок

        // Формируем топ-3, включая символы с одинаковым количеством
        List<String> topThree = new ArrayList<>();
        int rank = 0; // Текущая группа (ранг) по количеству вхождений
        int previousCount = -1;

        for (Map.Entry<String, Integer> entry : sortedEntries) {
            if (rank == 3 && entry.getValue() != previousCount) {
                break; // Прерываем, если достигли топ-3 групп и текущий элемент из новой группы
            }

            topThree.add(entry.getKey());

            if (entry.getValue() != previousCount) {
                rank++;
                previousCount = entry.getValue();
            }
        }

        // Формируем строку из результата
        return String.join(", ", topThree);
    }
}
