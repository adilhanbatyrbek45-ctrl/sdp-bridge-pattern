package com.payment.implementor;

public class HalykBank implements PaymentBank {
    @Override
    public void pay(double amount) {
        System.out.println("[Halyk] Оплата картой Halyk: " + amount + " ₸");
    }

    @Override
    public String getName() {
        return "Halyk";
    }
}