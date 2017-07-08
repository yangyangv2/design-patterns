package com.ca.dp.behavioral.observer;

/**
 * Pitfall
 * - unexpected updates
 * - large sized consequences
 * - what changed
 * - debugging difficult
 *
 * Summary
 * - decoupled communication
 * - built in functionality
 * - used with mediator
 *
 * Created by yanya04 on 6/13/2017.
 */
public class ObserverDemo {

    public static void main(String[] args) {

        // subject being observed
        WeatherPublisher publisher = new WeatherPublisher("rainy");

        // what happened during update
        WeatherSubscriber subscriber1 = new WeatherSubscriber("Alice");

        WeatherSubscriber subscriber2 = new WeatherSubscriber("Bob");

        publisher.addObserver(subscriber1);

        publisher.addObserver(subscriber2);

        publisher.setWeather("sunny");

        publisher.setWeather("rainy");

        publisher.setWeather("blizzard");
    }
}
