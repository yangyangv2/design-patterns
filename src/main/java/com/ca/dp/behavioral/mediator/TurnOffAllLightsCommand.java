package com.ca.dp.behavioral.mediator;

/**
 * Created by yanya04 on 6/13/2017.
 */
public class TurnOffAllLightsCommand implements  Command{

    private Mediator med;

    public TurnOffAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOffAllLights();
    }
}
