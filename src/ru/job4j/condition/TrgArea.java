package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double p2 = (a + b + c) / 2;
        double result = Math.sqrt(p2 * (p2 - a) * (p2 - b) * (p2 - c));
        return result;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
