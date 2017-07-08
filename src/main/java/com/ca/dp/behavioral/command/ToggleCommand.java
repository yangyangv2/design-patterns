package com.ca.dp.behavioral.command;

/**
 * Created by yanya04 on 6/12/2017.
 */
public class ToggleCommand implements Command {

    private Light light;

    public ToggleCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute(){
        light.toggle();;
    }
}
