package com.shan.strategies;

public sealed interface PaymentStrategy permits CreditCardPayment, PayPalPayment,
        BitcoinPayment, UpiPayment, ApplePayPayment, GooglePayPayment {
    void pay(double amount);
}