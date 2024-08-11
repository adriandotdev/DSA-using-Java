package com.designpatterns.observer;

public class Laptop implements ISubscriber {

    private WeatherSystem weatherSystem;

    private static int counter = 1;
    private int subscriberNo;

    public Laptop(WeatherSystem weatherSystem) {
        this.weatherSystem = weatherSystem;

        this.subscriberNo = counter;
        counter++;
    }

    @Override
    public void update() {

        System.out.println("Laptop #" + this.subscriberNo + " : " + this.weatherSystem.getWeatherData());
    }
}
