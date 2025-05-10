package com.shan.dp.decorator.notifier.config;


import com.shan.dp.decorator.notifier.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotifierConfig {
    private final NotifierProperties notifierProperties;

    public NotifierConfig(NotifierProperties notifierProperties) {
        this.notifierProperties = notifierProperties;
    }

    @Bean
    public Notifier notifier() {
        NotifierType base = notifierProperties.getBase();
        Notifier baseNotifier = switch (base) {
            case SMS -> new SMSNotifier();
            case EMAIL -> new EmailNotifier();
            case SLACK -> new SlackNotifier();
        };
        Notifier decorated = baseNotifier;
        for (DecoratorType decoratorType: notifierProperties.getDecorators()) {
            decorated = switch (decoratorType) {
                case LOGGING -> new LoggingNotifierDecorator(decorated);
                case RETRY -> new RetryNotifierDecorator(decorated);
                case TIMING -> new TimeMeasuringNotifierDecorator(decorated);
            };

        }
        return decorated;

    }
}
