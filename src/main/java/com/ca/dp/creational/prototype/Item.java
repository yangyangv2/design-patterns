package com.ca.dp.creational.prototype;

/**
 * Created by yanya04 on 5/10/2017.
 */
public abstract class Item implements Cloneable{

    private String title;
    private double price;
    private String url;

    public String getTitle() {
        return title;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
