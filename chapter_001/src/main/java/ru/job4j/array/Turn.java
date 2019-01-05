package ru.job4j.array;

/**
 * Класс для изменения порядка элементов в массиве.
 */
public class Turn {
    /**
     * Метод переворачивает массив целых чисел в обратном порядке
     * @param array - исходный массив
     * @return результирующий массив.
     */
    public int[] back(int[] array) {
        int iterations = array.length / 2;
        for (int i = 0; i < iterations; i++) {
            int temp = array[i];
            int turnpos = array.length - i - 1;
            array[i] = array[turnpos];
            array[turnpos] = temp;
        }
        return array;
    }
}
