package com.factory.pizza;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Sauce createSauce() {
        return new ChicagoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ChicagoCheese();
    }

}
