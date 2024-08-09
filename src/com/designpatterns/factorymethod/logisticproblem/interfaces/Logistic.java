package com.designpatterns.factorymethod.logisticproblem.interfaces;

public abstract class Logistic {

    public void PlanDelivery() {
        System.out.println("Plan Delivery");
    }

    public abstract ITransport CreateTransport();
}