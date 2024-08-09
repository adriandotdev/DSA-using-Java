package com.designpatterns.abstractfactory.concreteproducts;

import com.designpatterns.abstractfactory.interfaces.Table;

public class VictorianTable implements Table {
    @Override
    public boolean isGlassed() {
        return true;
    }

    @Override
    public void design() {
        System.out.println("Victorian Table Design");
    }
}
