package com.decorator.beverage;

public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return "House Blend";
    }

    @Override
    public int costInCents() {
        return 50;
    }

}
