package com.designpatterns.factorymethod.logisticproblem;

import com.designpatterns.factorymethod.logisticproblem.concreatecreator.RoadLogistic;
import com.designpatterns.factorymethod.logisticproblem.concreatecreator.SeaLogistic;
import com.designpatterns.factorymethod.logisticproblem.interfaces.ITransport;
import com.designpatterns.factorymethod.logisticproblem.interfaces.Logistic;

public class Main {
    public static void main(String[] args) {

        String logistic = "sea";
        Logistic log = null;

        if (logistic.equals("road")) {
            log = new RoadLogistic();
        }
        else if (logistic.equals("sea")) {
            log = new SeaLogistic();
        }

        ITransport transport = log.CreateTransport();
        transport.deliver();
    }
}
