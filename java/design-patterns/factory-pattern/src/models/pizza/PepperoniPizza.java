package src.models.pizza;

import src.models.ingredients.PizzaIngredientsFactory;

public class PepperoniPizza extends Pizza {
    PizzaIngredientsFactory ingredientsFactory;

    public PepperoniPizza(PizzaIngredientsFactory factory) {
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
