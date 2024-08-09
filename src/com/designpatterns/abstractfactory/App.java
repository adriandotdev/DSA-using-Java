package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.concretefactory.SimpleFurnitureFactory;
import com.designpatterns.abstractfactory.concretefactory.VictorianFurnitureFactory;
import com.designpatterns.abstractfactory.interfaces.FurnitureFactory;

public class App {
    public static void main(String[] args) {

        FurnitureFactory factory = null;
        String furniture = "simple";

        if (furniture.equals("victorian")) {
            factory = new VictorianFurnitureFactory();
        }
        else if (furniture.equals("simple")) {
            factory = new SimpleFurnitureFactory();
        }

        Client client = new Client(factory);
        client.setupFurnitures();
    }
}
