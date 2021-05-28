package ru.job4j.oop;

public class Triangle {
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double p2 = (a.distance(b) + b.distance(c) + c.distance(a)) / 2;
        return Math.sqrt(p2 * (p2 - a.distance(b)) * (p2 - b.distance(c)) * (p2 - c.distance(a)));
    }
}
