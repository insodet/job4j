package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] array = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = arrayDuplicate.remove(array);
        String[] excpected = {"Привет", "Мир", "Супер"};

        assertThat(result, arrayContainingInAnyOrder(excpected));
    }

    @Test
    public void whenRemoveDuplicatesInNumbersThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] array = {"1", "1", "2", "2", "3","1"};
        String[] result = arrayDuplicate.remove(array);
        String[] excpected = {"1", "2", "3"};

        assertThat(result, arrayContainingInAnyOrder(excpected));
    }
}