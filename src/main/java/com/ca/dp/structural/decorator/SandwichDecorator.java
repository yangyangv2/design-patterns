package com.ca.dp.structural.decorator;

/**
 * Created by yanya04 on 6/8/2017.
 */
public class SandwichDecorator implements Sandwich {

    protected  Sandwich customSandwich;

    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }
    @Override
    public String make() {
        return customSandwich.make();
    }
}
