package com.factory.pizza;

import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

import static java.util.Optional.ofNullable;

@Slf4j
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Optional<Pizza> optionalPizza = ofNullable(createPizza(type));

        if (optionalPizza.isPresent()) {
            Pizza pizza = optionalPizza.get();
            pizza.prepare();
            pizza.box();
            return pizza;
        } else {
            log.error("{}: Pizza type not supported: {}", this.getClass().getSimpleName(), type);
            return null;
        }
    }

    public abstract Pizza createPizza(String type);

}
