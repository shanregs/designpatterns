package com.shan.strategies;

public final class ApplePayPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via Apple Pay.");
    }
}
