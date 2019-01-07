package ru.job4j.array;


/**
 * Класс для опередления одинаковых элементов в диагоналях матрицы.
 */
public class MatrixCheck {
    /**
     * Проверяет содержат ли матрица одинаковые элементы по диагоналям.
     * @param data - исходная матрица
     * @return - результат
     */
    public boolean mono(boolean[][] data){
        boolean result = true;
        boolean leftEl = false;
        boolean rightEl = false;
        for (int i = 0; i < data.length; i++) {
            boolean[] row = data[i];
            int rightpos = row.length - i - 1;
            if (row.length < i || rightpos < 0){
                result = false;
                break;
            }
            if (i == 0)
            {
                leftEl = row[i];
                rightEl = row[rightpos];
            }else if (leftEl != row[i] || rightEl != row[rightpos]){
                result = false;
                break;
            }
        }
        return result;
    }
}
