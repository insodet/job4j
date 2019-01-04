package ru.job4j.loop;

/**
 * Ричует шахматную доску
 */
public class Board {

    /**
     * Возвращает изображение шахматной доски
     * @param width ширина доски
     * @param height высота доски
     * @return строка изображающая шахматную доску X - черная клетка, пробел - белая
     */
    public String paint(int width, int height)
    {
        StringBuilder builder = new StringBuilder();
        String separator = System.lineSeparator();

        for (int row = 0; row < height; row++) {

            for (int col = 0; col < width; col++) {

                if ((col + row) % 2 == 0)
                {
                    builder.append("X");
                }else
                {
                    builder.append(" ");
                }

            }

            builder.append(separator);
        }

        return builder.toString();
    }

}
