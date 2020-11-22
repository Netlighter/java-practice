package com.netlight.lab21_22;

import java.util.List;

public interface ItemStore {
    List<Item> getAllItem();

    Item getItem(int id);

    boolean addItem(Item item);

    boolean editItem(int id, Item item);

    boolean deleteItem(int id);
}
