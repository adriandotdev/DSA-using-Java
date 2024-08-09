package com.designpatterns.abstractfactory.concreteproducts;

import com.designpatterns.abstractfactory.interfaces.Table;

public class SimpleTable implements Table {
    @Override
    public boolean isGlassed() {
        return false;
    }

    @Override
    public void design() {
        System.out.println("Simple Table Design");
    }
}
