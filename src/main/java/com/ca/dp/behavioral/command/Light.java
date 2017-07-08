package com.ca.dp.behavioral.command;

/**
 * Created by yanya04 on 6/12/2017.
 */
// receiver
public class Light {

    private boolean on = false;

    public void toggle(){
        on = !on;
        System.out.println("Light: " + on);
    }

    public void on(){
        System.out.println("Light switch on.");
    }

    public void off(){
        System.out.println("Light switched off");
    }


}
