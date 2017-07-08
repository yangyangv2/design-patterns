package com.ca.dp.structural.decorator;

/**
 * Created by yanya04 on 6/8/2017.
 */
public class DressingDecorator extends SandwichDecorator {
    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make(){
        return this.customSandwich.make() + addDressing();
    }

    private String addDressing(){
        return " + mustard";
    }
}
