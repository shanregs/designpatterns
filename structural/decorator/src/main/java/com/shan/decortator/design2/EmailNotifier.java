package com.shan.decortator.design2;

public class EmailNotifier implements Notifier{
    @Override
    public void send(String msg) {
        System.out.println("Sending EMAIL: " + msg);
    }
}
