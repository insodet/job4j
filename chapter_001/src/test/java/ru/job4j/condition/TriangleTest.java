package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenPeriodSetThreePointsThenTrianglePeriod() {

        Triangle triangle = makeTestTriangle();
        double ab = triangle.sidelength(triangle.getA(), triangle.getB());
        double ac = triangle.sidelength(triangle.getA(), triangle.getC());
        double bc = triangle.sidelength(triangle.getB(), triangle.getC());
        double result = triangle.period(ab, ac, bc);

        double expected = 3.4D;

        assertThat(result, closeTo(expected, 0.1));

    }

    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Triangle triangle = makeTestTriangle();
        double result = triangle.area();

        double expected = 2D;

        assertThat(result, closeTo(expected, 0.1));
    }

    private Triangle makeTestTriangle()
    {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);

        return new Triangle(a, b, c);
    }
}