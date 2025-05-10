package com.shan.decortator.design2;

public class LoggingNotifier extends NotifierDecorator{
    public LoggingNotifier(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        System.out.println("[LOG] Sending message: " + message);
        super.send(message);
//        System.out.println("[LOG] Sending message DONE\n " );
    }
}
