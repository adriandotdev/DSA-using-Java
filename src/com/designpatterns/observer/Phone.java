package com.designpatterns.observer;

public class Phone implements  ISubscriber {

    private WeatherSystem weatherSystem;

    private static int counter = 1;
    private int subscriberNo;

    public Phone(WeatherSystem weatherSystem) {
        this.weatherSystem = weatherSystem;
        this.subscriberNo = counter;
        counter++;
    }

    @Override
    public void update() {
        System.out.println("Phone #" + this.subscriberNo + " : " + this.weatherSystem.getWeatherData());
    }
}
