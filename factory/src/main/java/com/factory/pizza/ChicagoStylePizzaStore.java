package com.factory.pizza;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ChicagoStylePizzaStore extends PizzaStore {

    private final ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory;

    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza(chicagoPizzaIngredientFactory);
            case "veggie":
                return new ChicagoStyleVeggiePizza(chicagoPizzaIngredientFactory);
            default:
                return null;
        }
    }

}
