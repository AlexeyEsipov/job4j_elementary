
package ru.job4j.tracker;


import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
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
                System.out.print("Enter ID: ");
                int selectId = Integer.parseInt(scanner.nextLine());
                Item selectItem = tracker.findById(selectId);
                Item editItem = new Item();
                System.out.println("Item: ID: " + selectItem.getId() + ", Name: " + selectItem.getName());
                System.out.println("Enter new Name:");
                editItem.setName(scanner.nextLine());
                if (tracker.replace(selectId, editItem)) {
                    System.out.println("Объект успешно изменен");
                } else {
                    System.out.println("Объект не изменен");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.print("Enter ID: ");
                int selectId = Integer.parseInt(scanner.nextLine());
                Item selectItem = tracker.findById(selectId);
                System.out.println("Item: ID: " + selectItem.getId() + ", Name: " + selectItem.getName());
                System.out.println("Delete this item? Select 1 for delete  or Select 2 to skip");
                int confirmDelete = Integer.parseInt(scanner.nextLine());
                if (confirmDelete == 1) {
                    if (tracker.delete(selectId)) {
                        System.out.println("Item was deleted successfully");
                    } else {
                        System.out.println("Объект не удален");
                    }
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.print("Enter ID: ");
                int selectId = Integer.parseInt(scanner.nextLine());
                if (tracker.findById(selectId) != null) {
                    Item selectItem = tracker.findById(selectId);
                    System.out.println("Item: ID: " + selectItem.getId() + ", Name: " + selectItem.getName());
                } else {
                    System.out.println("Обект с требуемым ID не найден");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.print("Enter name: ");
                String keyName = scanner.nextLine();
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
