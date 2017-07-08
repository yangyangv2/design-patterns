package com.ca.dp.structural.composite;

/**
 * Created by yanya04 on 6/8/2017.
 */
public class MenuItem extends MenuComponent{


    public MenuItem(String name, String url){
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString(){
        return print(this);
    }
}
