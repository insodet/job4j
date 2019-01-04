package ru.job4j.loop;

/**
 * Класс рисует пирамиду в псевдографике
 */
public class Paint {

    /**
     * Возвращает изображение пирамиды
     * @param height высота
     * @return пирамида
     */
    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

}
