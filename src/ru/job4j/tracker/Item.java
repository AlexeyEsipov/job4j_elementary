package ru.job4j.tracker;

public class Item {

    String id;
    String name;

    public Item() {
    }

    public Item(String id) {
        this.id = id;
    }

    public Item(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        Item item = new Item();
    }
}
