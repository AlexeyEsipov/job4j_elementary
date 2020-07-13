package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1Two2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3Two2Then3() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenFirst3Second3Then3() {
        int result = Max.max(3, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenFirst3Second2Third5Then5() {
        int result = Max.max(3, 2, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenFirst3Second5Third2Then5() {
        int result = Max.max(3, 5, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenFirst3Second5Third2Four4Then5() {
        int result = Max.max(3, 5, 2, 4);
        assertThat(result, is(5));
    }

    @Test
    public void whenFirst5Second0Third2Four4Then5() {
        int result = Max.max(5, 0, 2, 4);
        assertThat(result, is(5));
    }
}