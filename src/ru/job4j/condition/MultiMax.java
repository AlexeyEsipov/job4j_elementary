package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = (first > second) ? first : second;
        result = (result < third) ? third : result;
        return result;
    }
}
