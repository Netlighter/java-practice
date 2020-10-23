package com.netlight.lab13;

import java.util.Scanner;

public class Main {

    static void addDiamonds(Steve i) throws Exception {
        try {
            int items = Integer.parseInt(new Scanner(System.in).nextLine());
            i.setDiamonds(items);
        } catch (OutOfInventoryException ex) {
            System.out.println("Out of inventory!");
        } catch (Exception ex) {
            System.out.println("Invalid input!");
        } finally {
            System.out.println(i.toString());
        }
    }

    public static void main(String[] args) throws Exception {
        Steve inventory = new Steve();
        addDiamonds(inventory);

        // name for inventory? illegal
        inventory.setName("Shpeck");

    }
}
