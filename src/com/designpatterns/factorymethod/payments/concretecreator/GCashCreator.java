package com.designpatterns.factorymethod.payments.concretecreator;

import com.designpatterns.factorymethod.payments.abstractclass.PaymentCreator;
import com.designpatterns.factorymethod.payments.concretepayments.GCashPayment;
import com.designpatterns.factorymethod.payments.interfaces.Payment;

public class GCashCreator extends PaymentCreator {
    @Override
    public Payment createPayment() {
        return new GCashPayment();
    }
}
