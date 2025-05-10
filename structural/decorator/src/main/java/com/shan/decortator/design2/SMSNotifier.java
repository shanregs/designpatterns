package com.shan.decortator.design2;

public class SMSNotifier implements Notifier{
    @Override
    public void send(String msg) {
        System.out.println("Sending SMS: " + msg);
    }
}
