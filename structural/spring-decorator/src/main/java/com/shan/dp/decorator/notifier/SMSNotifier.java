package com.shan.dp.decorator.notifier;

public class SMSNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("\uD83D\uDCF1 Sending SMS: " + message);
    }
}
