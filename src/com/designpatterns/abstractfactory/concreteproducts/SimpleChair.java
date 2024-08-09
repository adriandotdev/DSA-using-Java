package com.designpatterns.abstractfactory.concreteproducts;

import com.designpatterns.abstractfactory.interfaces.Chair;

public class SimpleChair implements Chair {

    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void design() {
        System.out.println("Simple Chair Design");
    }
}
