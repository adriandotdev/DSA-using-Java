package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherSystem implements IPublisher{

    private List<ISubscriber> list;
    private String weatherData;

    public WeatherSystem() {
        this.list = new ArrayList<>();
        this.weatherData = "";
    }

    @Override
    public void subscribe(ISubscriber subscriber) {
        this.list.add(subscriber);
    }

    @Override
    public void unsubscribe(ISubscriber subscriber) {
        this.list.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {

        for (ISubscriber subscriber : this.list) {
            subscriber.update();
        }
    }

    public void setWeatherData(String data) {
        this.weatherData = data;
    }

    public String getWeatherData() {
        return this.weatherData;
    }
}
