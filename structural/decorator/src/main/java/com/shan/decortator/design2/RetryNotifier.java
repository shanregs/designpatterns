package com.shan.decortator.design2;

public class RetryNotifier extends NotifierDecorator{
    public RetryNotifier(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("[RETRY] Re-sending message.");
        super.send(message);
    }
}
