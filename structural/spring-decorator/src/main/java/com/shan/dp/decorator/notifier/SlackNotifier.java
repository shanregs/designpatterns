package com.shan.dp.decorator.notifier;

public class SlackNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("\uD83D\uDCAC Sending Slack message: " + message);
    }
}
