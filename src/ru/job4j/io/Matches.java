package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static final String APLAYER = "игрок А взял ";
    public static final String BPLAYER = "игрок B взял ";
    public static final String AWIN = "игрок А выиграл!!! ";
    public static final String BWIN = "игрок В выиграл!!! ";
    public static final String ONTABLE = "спичек, на столе ";
    public static final String RULEGAME = "Можно брать от 1 до 3 спичек, но не более остатка";
    public static final String BEGINGAME = "Начинаем. На столе 11 спичек";

    public static void main(String[] args) {
        int numberOfMatches = 11;
        boolean stepOfMatches = true;
        boolean player = true;
        System.out.println(RULEGAME);
        System.out.println(BEGINGAME);
        while (numberOfMatches != 0) {
            if (player) {
                System.out.print(APLAYER);
            } else {
                System.out.print(BPLAYER);
            }
            while (stepOfMatches) {
                Scanner sc = new Scanner(System.in);
                int step = sc.nextInt();
                if (step >= 1 && step <= 3 && step <= numberOfMatches) {
                    stepOfMatches = false;
                    numberOfMatches -= step;
                } else {
                    stepOfMatches = true;
                }
            }
            System.out.println(ONTABLE + numberOfMatches);
            stepOfMatches = true;
            player = !player;
        }
        if (player) {
            System.out.print(BWIN);
        } else {
            System.out.print(AWIN);
        }
    }
}
