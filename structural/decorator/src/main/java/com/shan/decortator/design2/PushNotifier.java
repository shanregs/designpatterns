package com.shan.decortator.design2;

public class PushNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Sending PUSH Notification: " + message);
    }
}
