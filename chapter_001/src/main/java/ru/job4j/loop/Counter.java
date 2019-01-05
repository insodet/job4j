package ru.job4j.loop;

/**
 * Класс для подсчета суммы четных чисел
 */
public class Counter {

    /**
     * Вычисляет сумму четных чисел в диапазоне
     * @param start начальное число
     * @param finish конечное число
     * @return сумма
     */
    public int add(int start, int finish)
    {
        int result = 0;
        for (int i = start; i <= finish; i++)
        {
            if (i % 2 == 0) {
                result = result + i;
            }
        }
        return result;
    }
}
