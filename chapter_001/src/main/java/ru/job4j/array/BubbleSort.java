package ru.job4j.array;

/**
 *
 * Класс для сортировки массивов
 */
public class BubbleSort {
    /**
     * Метод сортировки массива пузырком
     * @param array исходный массив
     * @return результат
     */
    public int[] sort(int[] array){
        int buf;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]){
                    buf = array[j];
                    array[j] = array[j+1];
                    array[j+1] = buf;
                }
            }
        }
        return array;
    }
}
