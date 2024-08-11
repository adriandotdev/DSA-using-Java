package com.designpatterns.observer;

public class App {
    public static void main(String[] args) {

        WeatherSystem ws = new WeatherSystem();
        ws.setWeatherData("35 degrees");

        Phone phone1 = new Phone(ws);
        Phone phone2 = new Phone(ws);

        Laptop laptop1 = new Laptop(ws);
        Laptop laptop2 = new Laptop(ws);

        ws.subscribe(phone1);
        ws.subscribe(phone2);
        ws.subscribe(laptop1);
        ws.subscribe(laptop2);

        ws.notifySubscribers();

        ws.unsubscribe(phone2);
        System.out.println("unsubscribe");
        ws.notifySubscribers();
    }
}
