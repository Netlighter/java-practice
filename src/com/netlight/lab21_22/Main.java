package com.netlight.lab21_22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        ItemStore localStore = new LocalJsonItemsStore();
        ItemStore httpStore = new JsonItemStore();
        Scanner scanner = new Scanner(System.in);
        String line = "";
        int change = 0;
        while (change != 3) {
            System.out.print(user.printChangeJson().toString());
            change = scanner.nextInt();
            switch (change) {
                case 1:
                    while (change != 6) {
                        System.out.print(user.printChangeLocalJson().toString());
                        change = getChange(user, localStore, scanner, localStore.getItem(change));
                    }
                    change = 0;
                    break;
                case 2:
                    while (change != 6) {
                        System.out.print(user.printChangeHttpJson().toString());
                        change = getChange(user, httpStore, scanner, localStore.getItem(change));
                    }
                    change = 0;
                    break;
                case 3:
                    System.out.println(user.printExit().toString());
                    break;
                default:
                    System.out.println(user.printError().toString());
                    break;
            }
        }
    }

    private static int getChange(User user, ItemStore localStore, Scanner scanner, Item item) {
        int change;
        String line;
        change = scanner.nextInt();
        switch (change) {
            case 1:
                System.out.print(user.printGetAllItem());
                System.out.println("" + localStore.getAllItem());
                break;
            case 2:
                System.out.print(user.printGetItem());
                change = scanner.nextInt();
                System.out.println("" +
                        (item != null
                                ? localStore.getItem(change)
                                : user.printGetError().toString()));
                break;
            case 3:
                System.out.println(user.printAddItem());
                scanner.nextLine();
                line = scanner.nextLine();
                System.out.println("" +
                        (localStore.addItem(new Item(Integer.parseInt(line.split(" ")[0]),
                                line.split(" ")[1],
                                Boolean.parseBoolean(line.split(" ")[2]),
                                line.split(" ")[3]))
                                ? user.printAddSuccessful().toString()
                                : user.printAddError().toString()));
                break;
            case 4:
                System.out.println(user.printEditItem());
                scanner.nextLine();
                line = scanner.nextLine();
                System.out.println("" +
                        (localStore.editItem(
                                Integer.parseInt(line.split(" ")[0]),
                                new Item(Integer.parseInt(line.split(" ")[1]),
                                        line.split(" ")[2],
                                        Boolean.parseBoolean(line.split(" ")[3]),
                                        line.split(" ")[4]))
                                ? user.printEditSuccessful().toString()
                                : user.printEditError().toString()));
                break;
            case 5:
                System.out.println(user.printDeleteItem());
                change = scanner.nextInt();
                System.out.println("" +
                        (localStore.deleteItem(change)
                                ? user.printDeleteSuccessful().toString()
                                : user.printDeleteError().toString()));
                break;
            case 6:
                System.out.println(user.printExit().toString());
                break;
            default:
                System.out.println(user.printError().toString());
                break;
        }
        return change;
    }
}
