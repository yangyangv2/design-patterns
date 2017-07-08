package com.ca.dp.structural.flyweight;

/**
 * Created by yanya04 on 6/9/2017.
 */
public class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
