package com.payment.abstraction;

import com.payment.implementor.PaymentBank;

public abstract class Subscription {
    protected PaymentBank bank;
    protected double price;

    public Subscription(PaymentBank bank, double price) {
        this.bank = bank;
        this.price = price;
    }

    public abstract void buy();
}