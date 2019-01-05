package ru.job4j.loop;

/**
 * Вычисляет факториал натуральных чисел
 */
public class Factorial {

    /**
     * Вычисляет фактороиал числа n
     *
     * @param n граница вычисления
     * @return факториал
     */
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}
