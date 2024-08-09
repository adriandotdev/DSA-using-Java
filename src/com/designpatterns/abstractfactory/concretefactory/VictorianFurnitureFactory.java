package com.designpatterns.abstractfactory.concretefactory;

import com.designpatterns.abstractfactory.concreteproducts.VictorianChair;
import com.designpatterns.abstractfactory.concreteproducts.VictorianTable;
import com.designpatterns.abstractfactory.interfaces.Chair;
import com.designpatterns.abstractfactory.interfaces.FurnitureFactory;
import com.designpatterns.abstractfactory.interfaces.Table;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
