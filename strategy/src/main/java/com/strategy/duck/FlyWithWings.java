package com.strategy.duck;

public class FlyWithWings implements FlyBehavior {

    @Override
    public String fly() {
        return FlyWithWings.class.getSimpleName();
    }

}
