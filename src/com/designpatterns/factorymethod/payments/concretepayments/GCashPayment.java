package com.designpatterns.factorymethod.payments.concretepayments;

import com.designpatterns.factorymethod.payments.interfaces.Payment;

public class GCashPayment implements Payment {

    private final int SERVICE_FEE = 35;
    private int amount;

    @Override
    public void pay(int amount) {
        System.out.println("Payment via GCash");

        this.amount = amount;
    }

    @Override
    public void createPaymentTransaction() {
        System.out.println("Creating transaction in GCash");
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
