package ru.job4j.array;

import java.util.Arrays;

/**
 * Класс для удаления дублей из массива
 */
public class ArrayDuplicate {
    /**
     * Удаляет дубли из массива
     * @param array - исходный массив
     * @return массив без дублей
     */
    public String[] remove(String[] array){
        int elcount = array.length;
        for (int i = 0; i < elcount; i++) {
            for (int j = i + 1; j < elcount; j++) {
                if (array[i].equals(array[j])){
                    array[j] = array[elcount-1];
                    elcount--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, elcount);
    }
}
