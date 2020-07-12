package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int result = value / 70;
        return result;
    }

    public static int rubleToDollar(int value) {
        int result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }
}
