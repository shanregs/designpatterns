package com.shan.dp.decorator.notifier;

public class RetryNotifierDecorator extends NotifierDecorator{
    public RetryNotifierDecorator(Notifier delegate) {
        super(delegate);
    }

    @Override
    public void send(String message) {
        int attempts = 0;
        boolean success = false;

        while (!success && attempts < 3) {
            try {
                System.out.println("\uD83D\uDD01 Retry attempt " + attempts);
                delegate.send(message);
                success = true;
            } catch (Exception e) {
                attempts++;
            }
        }

        if (!success) {
            System.out.println("\u274C Failed after retries.");
        }
    }
}