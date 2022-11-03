package src.models.store;

import src.models.pizza.Pizza;

public abstract class PizzaStore {
    public abstract Pizza createPizza(String item);
}
