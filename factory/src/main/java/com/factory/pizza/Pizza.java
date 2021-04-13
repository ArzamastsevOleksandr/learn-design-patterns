package com.factory.pizza;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
@Data
public abstract class Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;
    private String name;
    private Sauce sauce;
    private Cheese cheese;
    protected List<String> toppings = new ArrayList<>();

    public Pizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        setName(this.getClass().getSimpleName());
        setSauce(pizzaIngredientFactory.createSauce());
        setCheese(pizzaIngredientFactory.createCheese());
    }

    public void prepare() {
        log.debug("{}: Prepare: {} with toppings: {}", this.getClass().getSimpleName(), name, toppings);
    }

    public void box() {
        log.debug("{}: Boxing: {}", this.getClass().getSimpleName(), name);
    }

    public List<String> getToppings() {
        return Collections.unmodifiableList(toppings);
    }

}
