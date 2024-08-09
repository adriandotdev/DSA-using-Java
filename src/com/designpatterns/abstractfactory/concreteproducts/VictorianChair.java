package com.designpatterns.abstractfactory.concreteproducts;

import com.designpatterns.abstractfactory.interfaces.Chair;

public class VictorianChair implements Chair {


    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void design() {
        System.out.println("Victorian Chair Design");
    }
}
