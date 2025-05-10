package com.shan.dp.decorator.notifier;

public abstract  class NotifierDecorator implements Notifier{
    protected final Notifier delegate;

    protected NotifierDecorator(Notifier delegate) {
        this.delegate = delegate;
    }
}
