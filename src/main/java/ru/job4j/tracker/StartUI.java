
package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = Integer.parseInt(input.askStr("Select: "));

            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Добавленная заявка: " + item);

            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] items = tracker.findAll();
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println("Item: ID: " + item.getId() + ", Name: " + item.getName());
                    }
                } else {
                    System.out.println("Хранилище еще не содержит заявок");
                }

            } else if (select == 2) {
            System.out.println("=== Edit item ====");
            int selectId = input.askInt("Enter ID: ");
            String name = input.askStr("Enter new Name:");
            Item item = new Item(name);
                if (tracker.replace(selectId, item)) {
                    System.out.println("Объект успешно изменен");
                } else {
                    System.out.println("Объект не изменен");
                }

            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                int selectId = input.askInt("Enter ID: ");
                if (tracker.delete(selectId)) {
                    System.out.println("Item was deleted successfully");
                } else {
                    System.out.println("Объект не удален");
                }

            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                int selectId = input.askInt("Enter ID: ");
                Item item = tracker.findById(selectId);
                if (item != null) {
                    System.out.println("Item: ID: " + item.getId() + ", Name: " + item.getName());
                } else {
                    System.out.println("Объект с требуемым ID не найден");
                }

            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                String keyName = input.askStr("Enter name: ");
                Item[] allItem = tracker.findByName(keyName);
                if (allItem.length != 0) {
                    for (Item el: allItem) {
                        System.out.println("Item: ID: " + el.getId() + ", Name: " + el.getName());
                    }
                } else {
                    System.out.println("Объекты с требуемым именем не найдены");
                }

            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
