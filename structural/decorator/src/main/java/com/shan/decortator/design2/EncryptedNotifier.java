package com.shan.decortator.design2;

public class EncryptedNotifier extends NotifierDecorator{
    public EncryptedNotifier(Notifier wrappee) {
        super(wrappee);
    }
    private String encrypt(String message) {
        return "[ENCRYPTED] - " + message; // just a simulation
    }

    @Override
    public void send(String message) {
        String encMsg = encrypt(message);
        super.send(encMsg);
    }
}
