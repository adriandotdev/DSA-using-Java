package com.designpatterns.abstractfactory.concretefactory;

import com.designpatterns.abstractfactory.concreteproducts.SimpleChair;
import com.designpatterns.abstractfactory.concreteproducts.SimpleTable;
import com.designpatterns.abstractfactory.interfaces.Chair;
import com.designpatterns.abstractfactory.interfaces.FurnitureFactory;
import com.designpatterns.abstractfactory.interfaces.Table;

public class SimpleFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new SimpleChair();
    }

    @Override
    public Table createTable() {
        return new SimpleTable();
    }
}
