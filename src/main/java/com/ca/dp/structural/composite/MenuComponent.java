package com.ca.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanya04 on 6/8/2017.
 */
public abstract class MenuComponent {
    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public MenuComponent add(MenuComponent menuComponent){
        throw new UnsupportedOperationException("feature not implemented at this level");
    }

    public MenuComponent remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException("feature not implemented at this level");
    }

    String print(MenuComponent menuComponent){
        StringBuilder builder = new StringBuilder(name);
        builder.append(": ");
        builder.append(url);
        builder.append("\n");
        return builder.toString();
    }

    public abstract String toString();
}
