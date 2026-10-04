package com.payment;

import com.payment.abstraction.MonthPlan;
import com.payment.abstraction.Subscription;
import com.payment.abstraction.YearPlan;
import com.payment.implementor.FreedomBank;
import com.payment.implementor.HalykBank;
import com.payment.implementor.KaspiBank;
import com.payment.implementor.PaymentBank;

public class Main {
    public static void main(String[] args) {
        PaymentBank kaspi = new KaspiBank();
        PaymentBank halyk = new HalykBank();
        PaymentBank freedom = new FreedomBank();

        double pricePerMonth = 2000.0;

        Subscription sub1 = new MonthPlan(kaspi, pricePerMonth);
        sub1.buy();

        Subscription sub2 = new YearPlan(halyk, pricePerMonth);
        sub2.buy();

        Subscription sub3 = new MonthPlan(freedom, pricePerMonth);
        sub3.buy();
    }
}