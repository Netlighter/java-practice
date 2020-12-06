package com.netlight.lab25_26;

public interface IBetterMap<k, v> extends Iterable<v> {
    void add(k key, v value);

    v get(k key);

    v remove(k key);
}
