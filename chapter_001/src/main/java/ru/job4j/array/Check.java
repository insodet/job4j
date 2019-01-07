package ru.job4j.array;

/**
 * Класс для проверки элементов массива на равенство.
 */
public class Check {
    /**
     * Проверяет состояит ли массив из одинаковых значений
     * @param data исходный массив
     * @return результат true - если все элементы одинаковы, false в противном случае или если массив пуст
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        if (data.length != 0)
        {
            boolean currentel = data[0];
            for (int i = 1; i < data.length; i++) {
                if (currentel != data[i]) {
                    result = false;
                    break;
                }
            }
        }else {
            result = false;
        }
        return result;
    }
}
