package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
    int result = -1;
    int index = 0;
        for (String el: value) {
            if (el.equals(key)) {
                result = index;
            }
            index++;
        }
        if (result == -1) {
            throw new ElementNotFoundException("Key not found");
        }
    return result;
    }

    public static void main(String[] args) {
        String[] arrValue = {"smartphone", "notebook", "mouse"};
        String key = "keyboard";
        try {
            FindEl.indexOf(arrValue, key);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
