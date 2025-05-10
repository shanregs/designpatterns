package com.shan.decortator;

import com.shan.decortator.design1.Coffee;
import com.shan.decortator.design1.MilkDecorator;
import com.shan.decortator.design1.SimpleCoffee;
import com.shan.decortator.design1.SugarDecorator;
import com.shan.decortator.design2.*;


public class DecortatorApplication {

    public static void testDesign1() {
        System.out.println();
        Coffee coffee = new SimpleCoffee();
//        System.out.println(coffee);

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee);

        coffee = new SugarDecorator(new SimpleCoffee());
        System.out.println(coffee);
        System.out.println("Design 1 done\n");
    }
    public static void testDesign2() {
        System.out.println();
        String message = "Your account was credited with $500";
        Notifier baseNotifier = new EmailNotifier();
        Notifier complexNotifier = new RetryNotifier(new EncryptedNotifier(new LoggingNotifier(baseNotifier)));
        complexNotifier.send(message);
        System.out.println("Design 2 done\n");
    }

    public static void main(String[] args) {
//        testDesign1();
        testDesign2();

    }

}
