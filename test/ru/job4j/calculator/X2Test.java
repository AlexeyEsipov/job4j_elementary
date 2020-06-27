package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class X2Test {

    @Test
    public void whenBCZero() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int out = X2.calc(a, b, c, x);
        assertThat(out, is(expected));
    }

    @Test
    public void whenABCXOne() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int out = X2.calc(a, b, c, x);
        assertThat(out, is(expected));
    }

    @Test
    public void whenAZeroBCXOne() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int out = X2.calc(a, b, c, x);
        assertThat(out, is(expected));
    }

    @Test
    public void whenABOneCZeroXOne() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int out = X2.calc(a, b, c, x);
        assertThat(out, is(expected));
    }

    @Test
    public void whenABCOneXZero() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int out = X2.calc(a, b, c, x);
        assertThat(out, is(expected));
    }
}