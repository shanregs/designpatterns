package com.shan.dp.decorator;

import com.shan.dp.decorator.notifier.Notifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NotificationRunner implements CommandLineRunner {
    private final Notifier notifier;

    public NotificationRunner(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void run(String... args) throws Exception {
        notifier.send("\uD83D\uDE80 Dynamic Notifier in Action!");
    }
}
