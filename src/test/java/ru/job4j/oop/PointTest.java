package ru.job4j.oop;

import junit.framework.TestCase;


import static org.junit.Assert.assertEquals;

public class PointTest extends TestCase {

    public void testDistance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 4);
        double expected = 4.0;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }
}