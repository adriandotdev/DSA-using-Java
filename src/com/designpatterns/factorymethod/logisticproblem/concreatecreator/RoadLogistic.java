package com.designpatterns.factorymethod.logisticproblem.concreatecreator;

import com.designpatterns.factorymethod.logisticproblem.interfaces.Logistic;
import com.designpatterns.factorymethod.logisticproblem.concreteproduct.Truck;
import com.designpatterns.factorymethod.logisticproblem.interfaces.ITransport;

public class RoadLogistic extends Logistic {

    @Override
    public ITransport CreateTransport() {
        return new Truck();
    }
}
