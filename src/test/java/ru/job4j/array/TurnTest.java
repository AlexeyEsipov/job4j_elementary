package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.Turn;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2, 5, 7};
        int[] result = turner.back(input);
        int[] expect = new int[] {7, 5, 2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 7, 5};
        int[] result = turner.back(input);
        int[] expect = new int[] {5, 7, 6, 1, 4};
        assertThat(result, is(expect));
    }
}