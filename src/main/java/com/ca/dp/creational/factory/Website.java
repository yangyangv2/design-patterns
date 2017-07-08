package com.ca.dp.creational.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanya04 on 5/10/2017.
 */
public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public List<Page> getPages(){
        return pages;
    }

    public Website(){
        this.createWebsite();
    }

    public abstract void createWebsite();
}
