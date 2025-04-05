package com.shan.decortator.design1;

public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double price() {
        return 25.0;
    }

    @Override
    public String toString() {
        return getDescription() + ", " +  price();
    }
}
