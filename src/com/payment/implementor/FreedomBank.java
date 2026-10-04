package com.payment.implementor;

public class FreedomBank implements PaymentBank {
    @Override
    public void pay(double amount) {
        System.out.println("[Freedom] Оплата через Freedom: " + amount + " ₸");
    }

    @Override
    public String getName() {
        return "Freedom";
    }
}