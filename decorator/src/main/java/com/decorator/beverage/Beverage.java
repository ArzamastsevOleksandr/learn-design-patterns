package com.decorator.beverage;

import lombok.Getter;
import lombok.Setter;

public abstract class Beverage {

    @Getter
    @Setter
    private Size size = Size.SMALL;

    enum Size {
        SMALL, MEDIUM, LARGE
    }

    public abstract String getDescription();

    public abstract int costInCents();

    public String getFullDescription() {
        return getDescription() + " $" + costInCents() + " cents";
    }

}
