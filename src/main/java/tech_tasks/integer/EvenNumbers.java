package tech_tasks.integer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class EvenNumbers {
    public static void main(String[] args) {
//        findEvenNumbersViaLoop(10);

        findEvenNumbersViaStreamApi(10);
    }

    @Test
    @DisplayName("Check even numbers")
    void findEvenNumbersViaStreamApiTest() {
        List<Integer> actualEvenNumbers = findEvenNumbersViaStreamApi(10);

        List<Integer> expectedEvenNumbers = List.of(2, 4, 6, 8, 10);

        assertThat(actualEvenNumbers).isEqualTo(expectedEvenNumbers);
    }

    @Test
    @DisplayName("Check even numbers")
    void findEvenNumbersViaStreamApi2Test() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> actualEvenNumbers = findEvenNumbersViaStreamApiWithArguments(numbers);

        List<Integer> expectedEvenNumbers = List.of(2, 4, 6, 8, 10);

        assertThat(actualEvenNumbers).isEqualTo(expectedEvenNumbers);
    }

    @Test
    @DisplayName("Check even numbers")
    void findEvenNumbersViaStreamApi3Test() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, null);

        List<Integer> actualEvenNumbers = findEvenNumbersViaStreamApiWithArguments(numbers);

        List<Integer> expectedEvenNumbers = List.of(2, 4, 6, 8, 10);

        assertThat(actualEvenNumbers).isEqualTo(expectedEvenNumbers);
    }

    public static void findEvenNumbersViaLoop(int i) {

        int count = 0;
        String evenNumber = "";

        for (int j = 1; j <= i; j++) {

            /*

            Есть делимое, делитель, результат деление и остаток от деления

            '/' - деление
            '%' - остаток от деления

            1 / 2 = 0; 1 % 2 = 1
            2 / 2 = 1; 2 % 2 = 0
            3 / 2 = 1; 3 % 2 = 1

             */

            if (j % 2 == 0) {
                count++;
                evenNumber = evenNumber + j + ", "; // конкатенация строк, когда в Java складываешь число со строкой - результатом будет строка; Это работает автоматическая приведение типов
            }
        }
        if (count > 0) {
            System.out.print("Even numbers are: " + evenNumber);
        }
    }

    public static List<Integer> findEvenNumbersViaStreamApi(int i) {
        // При работе со StreamAPI
        // Первый шаг - это создать переменную 'коллекция';
        // Второй шаг - это отфильтровать и убрать все нечетные числа
        // Третий шаг - это вернуть отфильтрованную коллекцию

        List<Integer> numbers = IntStream.range(1, i + 1)
                .boxed()
                .toList();

        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
    }

    public List<Integer> findEvenNumbersViaStreamApiWithArguments(List<Integer> numbers) {

            return numbers
                    .stream()
                    .filter(Objects::nonNull)
                    .filter(n -> n % 2 == 0)
                    .toList();
    }
}
