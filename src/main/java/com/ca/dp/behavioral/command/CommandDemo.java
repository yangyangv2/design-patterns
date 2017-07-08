package com.ca.dp.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Pitfalls
 * - dependence on other patterns
 * - mutiliple commands
 * - make use of memento
 * - prototype for copies
 *
 * Summary
 * - encapsulate each request as an object
 * - decouple sender from processor
 * - very few drawbacks
 * - often used for undo functionality
 *
 * Created by yanya04 on 6/12/2017.
 */
public class CommandDemo {
    public static void main(String[] args) {
        Light light = new Light();
        Switch lightSwitch = new Switch();
        Command onCommand = new ToggleCommand(light);
        lightSwitch.storeAndExecute(onCommand);
        lightSwitch.storeAndExecute(onCommand);
        lightSwitch.storeAndExecute(onCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(new Light());
        lights.add(new Light());
        lights.add(new Light());
        Command allLightCommand = new AllLightCommand(lights);
        System.out.println("======================================");
        lightSwitch.storeAndExecute(allLightCommand);
        System.out.println("======================================");
        lightSwitch.storeAndExecute(allLightCommand);
    }
}
