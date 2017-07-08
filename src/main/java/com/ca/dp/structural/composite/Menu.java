package com.ca.dp.structural.composite;

import java.util.Iterator;

/**
 * Created by yanya04 on 6/8/2017.
 */
public class Menu extends MenuComponent {

    public Menu(String name, String url){
        this.name = name;
        this.url = url;
    }

    @Override
    public MenuComponent add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
        return menuComponent;
    }

    @Override
    public MenuComponent remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
        return menuComponent;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append(print(this));

        Iterator<MenuComponent> itr = menuComponents.iterator();
        while(itr.hasNext()){
            MenuComponent menuComponent = itr.next();
            builder.append(menuComponent.toString());
        }
        return builder.toString();
    }
}
