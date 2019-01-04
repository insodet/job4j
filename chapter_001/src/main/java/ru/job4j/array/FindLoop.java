package ru.job4j.array;

/**
 * Класс для поиска элементов в массиве
 */
public class FindLoop {

    /**
     * Находит позицию элемента в массиве.
     * @param data - массив данных
     * @param el - искомый элемент
     * @return позиция в массиве, -1 если не найден
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

}
