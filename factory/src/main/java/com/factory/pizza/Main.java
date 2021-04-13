package com.factory.pizza;

public class Main {

    public static void main(String[] args) {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore(new NYPizzaIngredientFactory());
        nyStylePizzaStore.orderPizza("cheese");
        nyStylePizzaStore.orderPizza("veggie");
        nyStylePizzaStore.orderPizza("bugaga");

        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore(new ChicagoPizzaIngredientFactory());
        chicagoStylePizzaStore.orderPizza("cheese");
        chicagoStylePizzaStore.orderPizza("veggie");
        chicagoStylePizzaStore.orderPizza("bugaga");
    }

}
