package com.shan.cart;

import com.shan.strategies.PaymentStrategy;

public class ShoppingCart {
    PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy paymentStrategy) {
        this.strategy = paymentStrategy;
    }

    public void checkout(double amount) {
        if(strategy == null) {
            throw new IllegalStateException("Payment strategy not set.");
        }
        strategy.pay(amount);
    }
}
