package com.shan;

import com.shan.cart.ShoppingCart;
import com.shan.strategies.CreditCardPayment;
import com.shan.strategies.GooglePayPayment;
import com.shan.strategies.UpiPayment;

public class StrategyApplication {
    public static void main(String[] args) {
        var cart = new ShoppingCart();

        cart.setStrategy(new CreditCardPayment("1234-1111-2222"));
        cart.checkout(120);

        cart.setStrategy(new UpiPayment("user@upi"));
        cart.checkout(80);

        cart.setStrategy(new GooglePayPayment());
        cart.checkout(60);
    }
}