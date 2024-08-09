package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.interfaces.Chair;
import com.designpatterns.abstractfactory.interfaces.FurnitureFactory;
import com.designpatterns.abstractfactory.interfaces.Table;

public class Client {

    private FurnitureFactory factory;
    private Chair chair;
    private Table table;

    public Client(FurnitureFactory factory) {

        if (factory == null) throw new IllegalArgumentException("Furniture Factory cannot be null");

        this.factory = factory;
    }

    public void setupFurnitures() {
        this.chair = this.factory.createChair();
        this.table = this.factory.createTable();

        this.chair.design();
        this.table.design();
    }
}
