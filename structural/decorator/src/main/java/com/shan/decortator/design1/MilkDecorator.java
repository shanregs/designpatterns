package com.shan.decortator.design1;



public class MilkDecorator extends AbstractCoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double price() {
        return super.price() + 1.5;
    }

}
