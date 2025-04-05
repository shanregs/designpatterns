package com.shan.decortator.design1;


public class SugarDecorator extends AbstractCoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    @Override
    public double price() {
        return super.price() + 0.5;
    }

}
