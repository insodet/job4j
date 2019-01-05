package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenAllArrayTrueMono() {
        boolean[] array = new boolean[]{true, true, true};
        Check check = new Check();
        boolean rst = check.mono(array);
        boolean expected = true;
        assertThat(rst, is(expected));
    }
    @Test
    public void whenAllArrayFalseMono() {
        boolean[] array = new boolean[]{false, false, false};
        Check check = new Check();
        boolean rst = check.mono(array);
        boolean expected = true;
        assertThat(rst, is(expected));
    }
    @Test
    public void whenArrayNotMono() {
        boolean[] array = new boolean[]{true, false, true};
        Check check = new Check();
        boolean rst = check.mono(array);
        boolean expected = false;
        assertThat(rst, is(expected));
    }
    @Test
    public void whenArrayEmptyMono() {
        boolean[] array = new boolean[0];
        Check check = new Check();
        boolean rst = check.mono(array);
        boolean expected = false;
        assertThat(rst, is(expected));
    }
}