package com.shan.dp.decorator.notifier.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "notifier")
public class NotifierProperties {
    private NotifierType base = NotifierType.EMAIL;
    private List<DecoratorType> decorators  = new ArrayList<>();
}
