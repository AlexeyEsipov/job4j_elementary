package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже пешеходы по лужам");
        } else if (position == 2) {
            System.out.println("Спят усталые игрушки, книжки спят. Одеяла и подушки ждут ребят.");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox box = new Jukebox();
        box.music(1);
        box.music(2);
        box.music(3);
    }
}
