package com.payment.implementor;

public class KaspiBank implements PaymentBank {
    @Override
    public void pay(double amount) {
        System.out.println("[Kaspi] Оплата через Kaspi QR: " + amount + " ₸");
    }

    @Override
    public String getName() {
        return "Kaspi";
    }
}