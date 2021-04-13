package com.factory.pizza;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NYStylePizzaStore extends PizzaStore {

    private final NYPizzaIngredientFactory nyPizzaIngredientFactory;

    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza(nyPizzaIngredientFactory);
            case "veggie":
                return new NYStyleVeggiePizza(nyPizzaIngredientFactory);
            default:
                return null;
        }
    }

}
