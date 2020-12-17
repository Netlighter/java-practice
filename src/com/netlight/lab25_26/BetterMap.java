package com.netlight.lab25_26;

import java.util.ArrayList;
import java.util.Iterator;

public class BetterMap<K, V> implements IBetterMap<K, V> {
    private final ArrayList<ArrayList<BetterItem<K, V>>> hashMap;
    private final int size = 2048;

    public BetterMap() {
        hashMap = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            hashMap.add(new ArrayList<>());
        }
    }

    @Override
    public void add(K k, V v) {
        boolean bool = false;
        int index = k.hashCode() % hashMap.size();
        System.out.println("Testing index: \n");
        System.out.println(index);
        System.out.println("Success\n");
        var betterItems = hashMap.get(index);
        if (betterItems.size() == 0) {
            betterItems.add(new BetterItem<>(k, v));
        } else {
            for (int i = 0; i < betterItems.size(); i++) {
                if (betterItems.get(i).getKey().equals(k)) {
                    betterItems.set(i, new BetterItem<>(k, v));
                    bool = true;
                    break;
                }
            }
            if (!bool) {
                betterItems.add(new BetterItem<>(k, v));
                System.out.println("Processing...\n");
                System.out.println(betterItems.add(new BetterItem<>(k, v)));
                System.out.println("Success\n");
            }
        }
    }

    @Override
    public V get(K k) {
        int index = k.hashCode() % hashMap.size();
        var betterItems = hashMap.get(index);
        for (BetterItem<K, V> betterItem : betterItems) {
            if (betterItem.getKey().equals(k))
                return betterItem.getValue();
        }
        return null;
    }

    @Override
    public V remove(K k) {
        int index = k.hashCode() % hashMap.size();
        var betterItems = hashMap.get(index);
        for (int i = 0; i < betterItems.size(); i++) {
            if (betterItems.get(i).getKey().equals(k)) {
                BetterItem<K, V> item = new BetterItem<>();
                item.setValue(betterItems.get(i).getValue());
                betterItems.remove(betterItems.get(i));
                return item.getValue();
            }
        }
        return null;
    }

    @Override
    public Iterator<V> iterator() {
        return (new Iterator<V>() {
            int currItemIndex = 0;
            int currArrIndex = 0;

            @Override
            public boolean hasNext() {
                if (currArrIndex == size - 1)
                    return false;

                while (hashMap.get(currArrIndex + 1).size() == 0) {
                    currArrIndex++;
                    currItemIndex = 0;
                    if (currArrIndex == size - 1)
                        return false;
                }

                var betterItems = hashMap.get(currArrIndex);
                if (currItemIndex == betterItems.size()) {
                    currArrIndex++;
                    currItemIndex = 0;
                }
                return (currArrIndex < size) &&
                        (currItemIndex < betterItems.size());
            }

            @Override
            public V next() {
                return hashMap
                        .get(currArrIndex)
                        .get(currItemIndex++).
                                getValue();
            }
        });
    }
}