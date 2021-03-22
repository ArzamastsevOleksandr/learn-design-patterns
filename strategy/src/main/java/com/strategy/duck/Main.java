package com.strategy.duck;

public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.swim();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setQuackBehavior(new Quack());
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.performQuack();
        modelDuck.performFly();
    }

}
