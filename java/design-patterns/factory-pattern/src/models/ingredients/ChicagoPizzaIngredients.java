package src.models.ingredients;

import src.models.ingredients.cheese.*;
import src.models.ingredients.clams.*;
import src.models.ingredients.dough.*;
import src.models.ingredients.sauce.*;

public class ChicagoPizzaIngredients implements PizzaIngredientsFactory {
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Clam createClam() {
        return new FrozenClam();
    }

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
}
