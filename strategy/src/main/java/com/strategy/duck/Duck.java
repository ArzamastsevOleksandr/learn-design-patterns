package com.strategy.duck;

import lombok.Setter;

public abstract class Duck {

    @Setter
    protected FlyBehavior flyBehavior;
    @Setter
    protected QuackBehavior quackBehavior;

    public abstract void display();

    public void performQuack() {
        System.out.println(this.getClass().getSimpleName() + ".performQuack: " + quackBehavior.quack());
    }

    public void performFly() {
        System.out.println(this.getClass().getSimpleName() + ".performFly: " + flyBehavior.fly());
    }

    public void swim() {
        System.out.println("All ducks swim");
    }

}
