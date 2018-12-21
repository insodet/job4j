package ru.job4j.calculator;

public class Fit {

    private final double manConst = 100D;
    private final double womanConst = 110D;

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        return calculateWeight(height, manConst);
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return calculateWeight(height, womanConst);
    }

    private double calculateWeight(double height, double heightConstant)
    {
        return (height - heightConstant) * 1.15D;
    }
}
