package com.payment.abstraction;

import com.payment.implementor.PaymentBank;

public class YearPlan extends Subscription {

    public YearPlan(PaymentBank bank, double monthlyPrice) {
        super(bank, monthlyPrice * 10);
    }

    @Override
    public void buy() {
        System.out.println("--- Оформление подписки на 1 год (со скидкой) ---");
        System.out.println("Выбран банк: " + bank.getName());
        bank.pay(price);
        System.out.println("Подписка на год успешно активна!\n");
    }
}