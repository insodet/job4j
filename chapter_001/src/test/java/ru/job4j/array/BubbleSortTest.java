package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void whenArrayWithEightElemnetsThenSort() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = new int[]{5,3,2,7,8,1,6,4};
        int[] result = bubbleSort.sort(array);
        int[] expected = new int[]{1,2,3,4,5,6,7,8};
        assertThat(result, is(expected));
    }
    @Test
    public void whenArrayWithFiveElemnetsThenSort() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = new int[]{7, 1, 5, 2, 3};
        int[] result = bubbleSort.sort(array);
        int[] expected = new int[]{1, 2, 3, 5, 7};
        assertThat(result, is(expected));
    }
}