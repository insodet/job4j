package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenArrayHaveEvenElementsBack() {
        int[] array = new int[] {1,2,3,4,5,6};
        Turn turn = new Turn();
        int[] res = turn.back(array);
        int[] expect = new int[]{6,5,4,3,2,1};
        assertThat(res, is(expect));
    }

    @Test
    public void whenArrayHaveOddElementsBack() {
        int[] array = new int[] {1,2,3,4,5,6,7};
        Turn turn = new Turn();
        int[] res = turn.back(array);
        int[] expect = new int[]{7,6,5,4,3,2,1};
        assertThat(res, is(expect));
    }
}