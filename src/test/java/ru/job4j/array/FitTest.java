package ru.job4j.array;

import org.junit.Test;
import ru.job4j.Fit;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenManHeight187() {
        short h = 187;
        double expected = 100.05;
        double out = Fit.manWeight(h);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanHeight170() {
        short h = 170;
        double expected = 69.0;
        double out = Fit.womanWeight(h);
        assertEquals(expected, out, 0.01);
    }
}