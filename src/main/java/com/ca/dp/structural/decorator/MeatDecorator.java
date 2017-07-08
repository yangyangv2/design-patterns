package com.ca.dp.structural.decorator;

/**
 * Created by yanya04 on 6/8/2017.
 */
public class MeatDecorator extends SandwichDecorator {
    public MeatDecorator(Sandwich customSandwich){
        super(customSandwich);
    }

    public String make(){
        return customSandwich.make() + addMeat();
    }

    private String addMeat(){
        return " + turkey";
    }
}
