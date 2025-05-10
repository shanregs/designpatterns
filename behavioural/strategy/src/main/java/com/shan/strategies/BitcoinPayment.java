package com.shan.strategies;

public final class BitcoinPayment implements PaymentStrategy {

    private final String wallet;

    public BitcoinPayment(String wallet) {
        this.wallet = wallet;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via Bitcoin wallet: " + wallet);
    }
}
