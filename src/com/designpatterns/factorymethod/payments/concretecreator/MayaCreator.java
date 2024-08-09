package com.designpatterns.factorymethod.payments.concretecreator;

import com.designpatterns.factorymethod.payments.abstractclass.PaymentCreator;
import com.designpatterns.factorymethod.payments.concretepayments.MayaPayment;
import com.designpatterns.factorymethod.payments.interfaces.Payment;

public class MayaCreator extends PaymentCreator {

    @Override
    public Payment createPayment() {
        return new MayaPayment();
    }
}
