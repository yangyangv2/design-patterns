package com.ca.dp.behavioral.mediator;

/**
 * Created by yanya04 on 6/13/2017.
 */
public class TurnOnAllLightsCommand implements  Command{

    private Mediator med;

    public TurnOnAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOnAllLights();
    }
}
