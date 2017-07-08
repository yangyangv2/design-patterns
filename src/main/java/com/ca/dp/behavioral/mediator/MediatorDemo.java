package com.ca.dp.behavioral.mediator;

/**
 * Pitfall
 * - Deity object
 * - Limits subclassing
 * - Over or with Command
 *
 * Summary
 * - Loose coupling
 * - simplified communication
 * - mediator complexity
 * - use with command pattern
 *
 *
 * Created by yanya04 on 6/13/2017.
 */
public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Light light1 = new Light();
        Light light2 = new Light();

        mediator.registerLight(light1);
        mediator.registerLight(light2);

        Command turnOnAllLgihtsCommand = new TurnOnAllLightsCommand(mediator);
        turnOnAllLgihtsCommand.execute();

        Command turnOffAllLgihtsCommand = new TurnOffAllLightsCommand(mediator);
        turnOffAllLgihtsCommand.execute();
    }
}
