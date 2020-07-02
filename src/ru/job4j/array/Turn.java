package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        boolean evenLength = array.length % 2 == 0;
        int maxIteration = evenLength ? array.length / 2 : (array.length - 1) / 2;
        int temp;
        for (int i = 0; i < maxIteration; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
