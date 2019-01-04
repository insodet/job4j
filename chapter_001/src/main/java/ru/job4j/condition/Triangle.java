package ru.job4j.condition;

/**
 * Класс для вычисления площади ({@link #area()}) и полупериода ({@link #period(double, double, double)}) треугольника
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    /**
     * Вычисляет полупериметр треугольника по длинам сторон
     * @param ab длина стороны ab
     * @param ac длина стороны ac
     * @param bc длина стороны bc
     * @return периметр
     */
    public double period(double ab, double ac, double bc)
    {
        return (ab + ac + bc) / 2D;
    }

    /**
     * Вычисляет площадь треугольника по длинам сторон
     * @return площадь треугольника, -1 если труегольник не существует.
     */
    public double area()
    {
        double rsl = -1;
        double ab = sidelength(a, b);
        double ac = sidelength(a, c);
        double bc = sidelength(b, c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {

            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }

    private boolean exist(double ab, double ac, double bc)
    {



        return ab > 0D && ac > 0D && bc > 0D;
    }

    /**
     * Вычисляет длину стороны по точкам
     * @param a - точка a
     * @param b - точка b
     * @return длина
     */
    public double sidelength(Point a, Point b)
    {
        return a.distanceTo(b);
    }

}
