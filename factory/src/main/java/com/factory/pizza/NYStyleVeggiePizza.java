package com.factory.pizza;

public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
        toppings.add("NYStyleVeggie");
    }

}
