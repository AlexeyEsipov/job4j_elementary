package ru.job4j.condition;

public class Game {
    /**
     * сравниваем переменную name с "super mario"
     * Сравнить переменную name с "tanks"
     * Сравнить переменную name с "tetris"
     */
    public static void menu(String name) {
        if (name.equals("super mario")) {
            System.out.println("Start - super mario");
        }
        if (name.equals("tanks")) {
            System.out.println("Start - tanks");
        }
        if (name.equals("tetris")) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("tanks");
    }
}
