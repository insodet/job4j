package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9};
        assertThat(rst, is(expect));
    }

    @Test
    public void whenBound0Then0() {
        int bound = 0;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {};
        assertThat(rst, is(expect));
    }

    @Test
    public void whenBound7Then14916253649() {
        int bound = 7;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1,4,9,16,25,36,49};
        assertThat(rst, is(expect));
    }

}