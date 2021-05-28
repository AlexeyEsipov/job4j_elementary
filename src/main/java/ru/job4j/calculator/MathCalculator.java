package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;
public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumAndDivision(double first, double second) {
        return sum(first, second)
                + division(first, second);
    }

    public static double sumAllTransactions(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + division(first, second)
                + difference(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат суммирования и умножения равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат суммирования и деления равен: " + sumAndDivision(10, 20));
        System.out.println("Результат суммирования всех операций равен: " + sumAllTransactions(10, 20));
    }
}
