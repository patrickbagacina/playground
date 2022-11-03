package src.models.store;

import src.models.pizza.*;
import src.models.ingredients.*;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientsFactory = new NYPizzaIngredients();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientsFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientsFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientsFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
