package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@DisplayName("Find max operations")
@Tag("arrayTests")
@Epic("Java Fundamentals")
@Feature("Find Max")
public class FindMaxTests {

    int[] arr = {4, 2, 9, 1, 5, 6};

    @Test
    @DisplayName("Should find max integer in array via array sort")
    public void findMaxViaSortTest() {

        Arrays.sort(arr);
        int max = arr[arr.length - 1];

        System.out.println(max);

        Assertions.assertThat(Integer.valueOf(max).compareTo(Integer.valueOf(9)))
                .withFailMessage(max + " is not equal to " + 9)
                .isEqualTo(0);
    }

    @Test
    @DisplayName("Should find max integer in array via array brute force scan")
    public void findMaxViaBruteForceTest() {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);

        Assertions.assertThat(Integer.valueOf(max).compareTo(Integer.valueOf(9)))
                .withFailMessage(max + " is not equal to " + 9)
                .isEqualTo(0);
    }

    @Test
    @DisplayName("Should find max integer in array via array linear scan")
    public void findMaxViaLinearScanTest() {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        System.out.println(max);

        Assertions.assertThat(Integer.valueOf(max).compareTo(Integer.valueOf(9)))
                .withFailMessage(max + " is not equal to " + 9)
                .isEqualTo(0);
    }
}
