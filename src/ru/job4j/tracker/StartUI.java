
package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.parseInt(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name =  input.askStr("Enter name: ");
                Item item = new Item();
                item.setName(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] allItem = tracker.findAll();
                for (Item el: allItem) {
                    System.out.println("Item: ID: " + el.getId() + ", Name: " + el.getName());
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                int selectId = input.askInt("Enter ID: ");
                Item editItem = new Item();
                editItem.setName(input.askStr("Enter new Name:"));
                if (tracker.replace(selectId, editItem)) {
                    System.out.println("Объект успешно изменен");
                } else {
                    System.out.println("Объект не изменен");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                int selectId = input.askInt("Enter ID: ");
                int confirmDelete = input.askInt("Delete this item? Select 1 for delete  or Select 2 to skip");
                if (confirmDelete == 1) {
                    if (tracker.delete(selectId)) {
                        System.out.println("Item was deleted successfully");
                    } else {
                        System.out.println("Объект не удален");
                    }
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                int selectId = input.askInt("Enter ID: ");
                Item selectItem = tracker.findById(selectId);
                if (selectItem != null) {
                    System.out.println("Item: ID: " + selectItem.getId() + ", Name: " + selectItem.getName());
                } else {
                    System.out.println("Обект с требуемым ID не найден");
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
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
