package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        boolean condition = left > right;
        return condition ? left : right;
    }

    public static int max(int first, int second, int third) {
        boolean condition = max(first, second) > third;
        int result = condition ? max(first, second) : third;
        return result;
    }

    public static int max(int first, int second, int third, int four) {
        boolean condition = max(first, second, third) > four;
        int result = condition ? max(first, second, third)  : four;
        return result;
    }
}
