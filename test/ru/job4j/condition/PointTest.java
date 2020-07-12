package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenX1Y1ZeroX2ThreeY2Four() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        double expected = 5.0;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX1Y1ZeroX2FourY2Three() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 3);
        double expected = 5.0;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }
}