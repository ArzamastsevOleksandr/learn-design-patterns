package com.factory.pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
        toppings.add("NYStyleCheese");
    }

}
