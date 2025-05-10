package com.shan.decortator.design2;

public abstract class NotifierDecorator implements Notifier{
    private Notifier wrappee;

    public NotifierDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void send(String message) {
        wrappee.send(message);
    }
}
