package com.decorator.beverage;

import java.util.Map;

import static java.lang.String.format;

public class Soy extends CondimentDecorator {

    private final Map<Size, Integer> size2CostInCents = Map.of(
            Size.SMALL, 5,
            Size.MEDIUM, 10,
            Size.LARGE, 15
    );

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return format("Soy [%s]", getBeverage().getDescription());
    }

    @Override
    public int costInCents() {
        return size2CostInCents.get(getSize()) + getBeverage().costInCents();
    }

}
