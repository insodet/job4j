package ru.job4j.array;

/**
 *Класс, заполняющий массив квадратами чисел
 */
public class Square {

    /**
     * Создает массив и заполняет его квадратами чисел от 1/
     * @param bound размер массива
     * @return результат
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];

        for (int i = 1; i <= bound; i++) {
            rst[i-1] = (int) Math.pow(i, 2);
        }

        return rst;
    }

}
