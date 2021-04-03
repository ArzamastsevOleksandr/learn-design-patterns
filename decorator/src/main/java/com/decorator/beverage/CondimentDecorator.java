package com.decorator.beverage;

public abstract class CondimentDecorator extends Beverage {

    private final Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public Size getSize() {
        return beverage.getSize();
    }

}
