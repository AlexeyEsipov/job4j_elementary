package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenX1Y1ZeroX2ThreeY2Four() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 3;
        int y2 = 4;
        double expected = 5.0;
        double out = Point.distance(0, 0, 3, 4);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX1Y1ZeroX2FourY2Three() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 4;
        int y2 = 3;
        double expected = 5.0;
        double out = Point.distance(0, 0, 3, 4);
        assertEquals(expected, out, 0.01);
    }
}