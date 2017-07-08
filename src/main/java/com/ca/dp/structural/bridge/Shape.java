package com.ca.dp.structural.bridge;

/**
 * Created by yanya04 on 5/10/2017.
 */
public abstract class Shape {

    protected Color color;

    public Shape(Color color){
        this.color = color;
    }

    public abstract void applyColor();
}
