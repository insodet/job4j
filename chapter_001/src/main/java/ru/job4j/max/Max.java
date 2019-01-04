package ru.job4j.max;

/**
 * This class is able to compare numbers. @see #max
 */
public class Max {

    /**
     * Return maximum of two integers.
     * @param first - first parameter
     * @param second - second parameter
     * @return maximum number.
     */
    public int max(int first, int second)
    {
        return (first > second) ? first : second;
    }

    /**
     * Возвращает максимальное число из трех.
     * @param first первое число
     * @param second второе число
     * @param third третье число
     * @return максимальное число
     */
    public int max(int first, int second, int third)
    {
        return max(max(first, second), third);
    }

}
