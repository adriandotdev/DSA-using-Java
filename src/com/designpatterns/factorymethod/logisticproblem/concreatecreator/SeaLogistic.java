package com.designpatterns.factorymethod.logisticproblem.concreatecreator;

import com.designpatterns.factorymethod.logisticproblem.interfaces.Logistic;
import com.designpatterns.factorymethod.logisticproblem.concreteproduct.Ship;
import com.designpatterns.factorymethod.logisticproblem.interfaces.ITransport;

public class SeaLogistic extends Logistic {
    @Override
    public ITransport CreateTransport() {
        return new Ship();
    }
}
