package com.ca.dp.creational.factory;

/**
 * Created by yanya04 on 5/10/2017.
 */
public class Shop extends Website {

    @Override
    public void createWebsite(){
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
