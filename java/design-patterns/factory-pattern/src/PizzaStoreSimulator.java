package src;

import src.models.store.*;
import src.models.pizza.Pizza;

public class PizzaStoreSimulator {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza1 = nyStore.createPizza("cheese");
        System.out.println("Pizza 1: " + pizza1.toString());

        Pizza pizza2 = chicagoStore.createPizza("cheese");
        System.out.println("Pizza 2: " + pizza2.toString());
    }
}
