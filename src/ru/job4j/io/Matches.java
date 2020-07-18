package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static final String STEP = "взял ";
    public static final String WIN = "выиграл!!! ";
    public static final String ONTABLE = "спичек, на столе ";
    public static final String RULEGAME = "Можно брать от 1 до 3 спичек, но не более остатка";
    public static final String BEGINGAME = "Начинаем. На столе 11 спичек";

    public static void main(String[] args) {
        int numberOfMatches = 11;
        boolean player = true;
        System.out.println(RULEGAME);
        System.out.println(BEGINGAME);
        while (numberOfMatches > 0) {
            String name = player ? "игрок А " : " игрок В ";
            System.out.print(name + STEP);
            Scanner sc = new Scanner(System.in);
            int step = sc.nextInt();
            while (step < 1 || step > 3 || step > numberOfMatches){
                step = sc.nextInt();
            }
            numberOfMatches -= step;
            if (numberOfMatches <= 0) {
                System.out.println(name + WIN);
                break;
            }
            System.out.println(ONTABLE + numberOfMatches);
            player = !player;
        }
    }
}
