package com.designpatterns.factorymethod.payments.concretepayments;

import com.designpatterns.factorymethod.payments.interfaces.Payment;

public class MayaPayment implements Payment {

    private final int SERVICE_FEE = 25;
    private int amount;

    @Override
    public void pay(int amount) {
        System.out.println("Payment via Maya");

        this.amount = amount;
    }

    @Override
    public void createPaymentTransaction() {
        System.out.println("Creating Transaction in Maya");
    }

    @Override
    public int getServiceFee() {
        return this.amount >= 1000 ? this.SERVICE_FEE : 0;
    }

    @Override
    public int totalPayment() {
        return this.amount + this.getServiceFee();
    }
}
