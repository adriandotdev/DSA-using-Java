package com.designpatterns.factorymethod.payments.interfaces;

public interface Payment {

    public void pay(int amount);
    public void createPaymentTransaction();
    public int getServiceFee();
    public int totalPayment();
}
