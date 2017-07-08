package com.ca.dp.structural.bridge;

/**
 * Created by yanya04 on 5/10/2017.
 */
public class Square extends Shape {

    public Square(Color color){
        super(color);
    }

    @Override
    public void applyColor(){
        color.applyColor();
    }

}
