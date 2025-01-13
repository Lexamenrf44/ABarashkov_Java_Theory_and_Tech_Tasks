package tech_tasks.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BackspaceStringCompare {

    /*
    Two strings are said to be the same if they are of the same length and have the same character at each index.
    Backspacing in a string removes the previous character in the string.
    Given two strings containing lowercase English letters and the character "#' which represents a backspace key, determine if the two final strings are equal.
    Return 1 if they are equal or 0 if they are not.

    Note that backspacing an empty string results in an empty string.
     */

    @Test
    void nullElementTest() {
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> backspaceCompare(null, null));
        System.out.println("Exception message: " + thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Strings cannot be null"));
    }

    @Test
    void positiveTest1() {
        String x = "asdcasa#";
        String y = "#asd#asda";
        assertEquals(0, backspaceCompare(x, y));
    }

    @Test
    void positiveTest2() {
        String x = "as#dcasa#";
        String y = "#as#dcasa#";
        assertEquals(1, backspaceCompare(x, y));
    }

    @Test
    void positiveTest3() {
        String x = "abcd#3"; // результат = 'a' - усложнить задачу; Если числа нет - по-умолчанию - 1 удаление;
        String y = "#as#dcasa#";
        assertEquals(1, backspaceCompare(x, y));
    }

    public static int backspaceCompare(String comparable1, String comparable2) {

        // Null array handling
        if (comparable1 == null || comparable2 == null) {
            throw new IllegalArgumentException("Strings cannot be null");
        }

        // Для решения данной задачи нам потребуются следующие методы для работы со String
        // 1) contains() (позволит определить нам есть ли "#" в строке или нет
        // 2) substring() (позволит вырезать из изначальной строки до и после "#"
        // 3) length() (для определения длины строки)
        // 'optional' concat() (позволит объединить обрезки строк)
        // 4) indexOf() (в отличии от contains() позволит не только найти, но и указать ее индекс)
        // 'optional' replace() (для удаление искомого элемента)

        // как проверить что у тебя символ числовой, а не строка
        // parseInt();

        String first = sanitizeStringWithHashes(comparable1);
        String second = sanitizeStringWithHashes(comparable2);

        int result = first.compareTo(second);

        if (result == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    private static String sanitizeStringWithHashes(String stringToSanitize) {

        while (stringToSanitize.contains("#")) {

            String begin;

            int i = stringToSanitize.indexOf("#");
            if (i == 0) {
                begin = stringToSanitize.substring(0, i);
            } else {
                begin = stringToSanitize.substring(0, i - 1);
            }

            String end = stringToSanitize.substring(i + 1);

            stringToSanitize = begin.concat(end);
        }

        return stringToSanitize;
    }
}
