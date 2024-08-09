package com.designpatterns.factorymethod.payments.abstractclass;

import com.designpatterns.factorymethod.payments.interfaces.Payment;

public abstract class PaymentCreator {

    public abstract Payment createPayment();
}
