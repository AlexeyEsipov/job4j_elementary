package ru.job4j.sort;

import java.util.Arrays;

public class Machine {

    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int debt = money - price;
        while (debt > 0) {
            int j = 0;
            for (int i = 0; i < 4; i++) {
                if (debt >= coins[i]) {
                    j = i;
                    break;
                }
            }
            rsl[size] = coins[j];
            debt -= coins[j];
            size++;
        }
        return Arrays.copyOf(rsl, size);
    }
}
