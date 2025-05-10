package com.shan.strategies;

public final class GooglePayPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via Google Pay.");
    }
}
