package com.shan.dp.decorator.notifier;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("\uD83D\uDCE7 Sending Email: " + message);
    }
}
