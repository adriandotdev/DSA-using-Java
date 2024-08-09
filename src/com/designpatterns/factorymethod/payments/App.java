package com.designpatterns.factorymethod.payments;

import com.designpatterns.factorymethod.payments.abstractclass.PaymentCreator;
import com.designpatterns.factorymethod.payments.concretecreator.GCashCreator;
import com.designpatterns.factorymethod.payments.concretecreator.MayaCreator;
import com.designpatterns.factorymethod.payments.interfaces.Payment;

public class App {
    public static void main(String[] args) {

        PaymentCreator paymentCreator = null;
        String paymentType = "gcash";

        if (paymentType.equals("maya")) {
            paymentCreator = new MayaCreator();
        } else if (paymentType.equals("gcash")) {
            paymentCreator = new GCashCreator();
        }

        Payment payment = paymentCreator.createPayment();

        payment.pay(1000);
        payment.createPaymentTransaction();
        System.out.println("Service Fee: " + payment.getServiceFee());
        System.out.println("Total Amount: " + payment.totalPayment());
    }
}
