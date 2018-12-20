package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    private final int dollarCourse = 60;
    private final int euroCourse = 70;

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return convert(value, euroCourse);
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return convert(value, dollarCourse);
    }

    public int dollarToRuble(int value) {
        return reConvert(value, dollarCourse);
    }

    public int euroToRuble(int value) {
        return reConvert(value, euroCourse);
    }

    private int convert(int value, int course)
    {
        return value / course;
    }

    private int reConvert(int value, int course)
    {
        return value * course;
    }
}
