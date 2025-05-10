package com.shan.strategies;

public final class UpiPayment implements PaymentStrategy {
    private final String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via UPI: " + upiId);
    }

}
