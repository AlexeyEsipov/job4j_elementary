package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.SwitchArray;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, 3);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap0to2() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {3, 2, 1, 4};
        int[] rsl = SwitchArray.swap(input, 0, 2);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwapBorder0to4() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expect = {5, 2, 3, 4, 1};
        int[] rsl = SwitchArray.swapBorder(input);
        assertThat(rsl, is(expect));

    }
}