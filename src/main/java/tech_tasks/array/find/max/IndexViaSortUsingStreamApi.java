package tech_tasks.array.find.max;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*

Find index of maximum value in sorted array using stream api

*/

public class IndexViaSortUsingStreamApi {

    @Test
    void indexTest() {

        int[] arr = {4, 2, 9, 1, 5, 6};
        int max = Arrays.stream(arr).max().getAsInt();

        Arrays.sort(arr);

        int maxIndex = Arrays.binarySearch(arr, max);

        assertEquals(5, maxIndex);
    }
}
