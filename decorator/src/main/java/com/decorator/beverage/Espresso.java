package com.decorator.beverage;

public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public int costInCents() {
        return 100;
    }

}
