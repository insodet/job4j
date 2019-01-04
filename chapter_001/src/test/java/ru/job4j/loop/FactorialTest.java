package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void calcFactorail5() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);

        assertThat(result, is(120));
    }

    @Test
    public void calcFactorail0() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);

        assertThat(result, is(1));
    }

}