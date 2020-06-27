package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenPFourKOne() {
        int p = 4;
        int k = 1;
        double expected = 1.0;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPSixKTwo() {
        int p = 6;
        int k = 2;
        double expected = 2.0;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}