package src.models.pizza;

import src.models.ingredients.PizzaIngredientsFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientsFactory ingredientsFactory;

    public CheesePizza(PizzaIngredientsFactory factory) {
        this.ingredientsFactory = factory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientsFactory.createDough();
        clam = ingredientsFactory.createClam();
        cheese = ingredientsFactory.createCheese();
        sauce = ingredientsFactory.createSauce();
    }
}
