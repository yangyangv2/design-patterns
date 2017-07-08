package com.ca.dp.behavioral.command;

import java.util.List;

/**
 * Created by yanya04 on 6/12/2017.
 */
public class AllLightCommand implements Command {
    private List<Light> lights;

    public  AllLightCommand(List<Light> lights){
        this.lights = lights;
    }

    @Override
    public void execute() {
        for(Light light: lights){
            light.toggle();
        }
    }
}
