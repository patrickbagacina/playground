package src.models.store;

import src.models.pizza.*;
import src.models.ingredients.*;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientsFactory = new ChicagoPizzaIngredients();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientsFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientsFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientsFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
