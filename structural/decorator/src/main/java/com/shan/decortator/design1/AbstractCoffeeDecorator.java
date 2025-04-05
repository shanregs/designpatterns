package com.shan.decortator.design1;

import lombok.Data;

@Data
public abstract class AbstractCoffeeDecorator implements Coffee{

    protected  Coffee decoratedCoffee;

    public AbstractCoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double price() {
        return decoratedCoffee.price();
    }

    @Override
    public String toString() {
        return getDescription() + ", " +  price();
    }
}
