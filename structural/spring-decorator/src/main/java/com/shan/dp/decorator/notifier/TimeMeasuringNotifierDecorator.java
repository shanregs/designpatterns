package com.shan.dp.decorator.notifier;

public class TimeMeasuringNotifierDecorator extends NotifierDecorator{
    public TimeMeasuringNotifierDecorator(Notifier delegate) {
        super(delegate);
    }

    @Override
    public void send(String message) {
        long start = System.currentTimeMillis();
        delegate.send(message);
        long end = System.currentTimeMillis();
        System.out.println("\u23F1 Took " + (end - start) + " ms");
    }
}
