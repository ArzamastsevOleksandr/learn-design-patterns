package com.decorator.beverage;

import java.util.Map;

import static java.lang.String.format;

public class Mocha extends CondimentDecorator {

    private final Map<Size, Integer> size2CostInCents = Map.of(
            Size.SMALL, 10,
            Size.MEDIUM, 20,
            Size.LARGE, 30
    );

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return format("Mocha [%s]", getBeverage().getDescription());
    }

    @Override
    public int costInCents() {
        return size2CostInCents.get(getBeverage().getSize()) + getBeverage().costInCents();
    }

}
