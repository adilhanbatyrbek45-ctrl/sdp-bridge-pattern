package com.payment.abstraction;

import com.payment.implementor.PaymentBank;

public class MonthPlan extends Subscription {

    public MonthPlan(PaymentBank bank, double price) {
        super(bank, price);
    }

    @Override
    public void buy() {
        System.out.println("--- Оформление подписки на 1 месяц ---");
        System.out.println("Выбран банк: " + bank.getName());
        bank.pay(price);
        System.out.println("Подписка на месяц успешно активна!\n");
    }
}