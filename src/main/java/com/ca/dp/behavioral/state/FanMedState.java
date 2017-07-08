package com.ca.dp.behavioral.state;

/**
 * Created by yanya04 on 6/13/2017.
 */
public class FanMedState extends State {
    private Fan fan;

    public FanMedState(Fan fan) {
        this.fan = fan;
    }
    @Override
    public void handleRequest(){
        System.out.println("Turning fan on to high");
        fan.setState(fan.getFanHighState());
    }

    @Override
    public String toString() {
        return "Fan is med";
    }
}
