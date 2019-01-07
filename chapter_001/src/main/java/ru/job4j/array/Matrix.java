package ru.job4j.array;

/**
 * Класс для создания матрицы таблицы умножения.
 */
public class Matrix {

    /**
     * Формирует матрицу таблицы умножения
     * @param size - размер матрицы
     * @return таблица умножения.
     */
    int[][] multiple(int size) {
        int[][] result = new int[size][size];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (i + 1) * (j + 1);
            }
        }
        return  result;
    }
}
