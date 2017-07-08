package com.ca.dp.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by yanya04 on 6/13/2017.
 */
public class WeatherSubscriber implements Observer {

    private String name;

    public WeatherSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {

        System.out.println("Subscriber: " + name + ": "+ ((WeatherPublisher)o).getWeather() + " notifyObservers arg: " + arg);
    }
}
