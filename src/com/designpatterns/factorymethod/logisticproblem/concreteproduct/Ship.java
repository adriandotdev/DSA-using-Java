package com.designpatterns.factorymethod.logisticproblem.concreteproduct;

import com.designpatterns.factorymethod.logisticproblem.interfaces.ITransport;

public class Ship implements ITransport {
    @Override
    public void deliver() {
        System.out.println("Delivery via Ship");
    }
}
