package com.shan.dp.decorator.notifier;

public class LoggingNotifierDecorator extends NotifierDecorator{
    public LoggingNotifierDecorator(Notifier delegate) {
        super(delegate);
    }

    @Override
    public void send(String message) {
        System.out.println("\uD83D\uDD0D [Log Start]");
        delegate.send(message);
        System.out.println("\u2705 [Log End]");
    }
}
