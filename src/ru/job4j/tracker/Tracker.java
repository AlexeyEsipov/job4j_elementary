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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll(){
        Item[] result = new Item[items.length];
        int j = 0;
        for (int i = 0; i < size ; i++) {
            if (items[i].getId() != 0) {
                result[j++] = items[i];
            }
        }
        return Arrays.copyOf(result, j);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[items.length];
        int j = 0;
        for (int i = 0; i < size ; i++) {
            if (items[i].getName().equals(key)) {
                result[j++] = items[i];
            }
        }
        return Arrays.copyOf(result, j);
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            return true;
        } else {
            return false;
        }
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

}
