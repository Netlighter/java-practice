package com.netlight.lab25_26;

public class BetterItem<K, V> {
    private K key;
    private V value;

    public BetterItem() {
    }

    public BetterItem(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

