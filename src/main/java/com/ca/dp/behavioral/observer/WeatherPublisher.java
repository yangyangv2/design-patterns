package com.ca.dp.behavioral.observer;

import java.util.Observable;

/**
 * Created by yanya04 on 6/13/2017.
 */
public class WeatherPublisher extends Observable {
    private String weather;

    public WeatherPublisher(String weather) {
        this.weather = weather;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
        this.setChanged();
        this.notifyObservers("what");
    }
}
