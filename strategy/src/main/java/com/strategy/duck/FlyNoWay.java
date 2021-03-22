package com.strategy.duck;

public class FlyNoWay implements FlyBehavior {

    @Override
    public String fly() {
        return FlyNoWay.class.getSimpleName();
    }

}
