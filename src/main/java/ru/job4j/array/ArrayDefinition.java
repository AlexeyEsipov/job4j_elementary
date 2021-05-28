package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива ages[] равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива surnames[] равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива prices[] равен: " + prices.length);
        String[] names = new String[4];
        System.out.println("Размер массива names[] равен: " + names.length);
        names[0] = "Petrov";
        names[1] = "Sidorov";
        names[2] = "Ivanov";
        names[3] = "Boev";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
