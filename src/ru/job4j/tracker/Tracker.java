package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item result = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                result = item;
                break;
            }
        }
        return result;
    }

    public Item[] findAll(){
        Item[] result = new Item[items.length];
        int j = 0;
        for (Item el: items) {
            if (el.getId() != 0) {
                result[j++] = el;
            }
        }
        return Arrays.copyOf(result, j);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[items.length];
        int j = 0;
        for (Item el: items) {
            if (el.getName().equals(key)) {
                result[j++] = el;
            }
        }
        return Arrays.copyOf(result, j);
    }
}
