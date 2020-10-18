package com.netlight.lab12;

public enum EnumEx {
    GREEN(32),
    YELLOW(93),
    RED(31);

    private final int key;

    EnumEx(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }
}
