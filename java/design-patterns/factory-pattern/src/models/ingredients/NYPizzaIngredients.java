package src.models.ingredients;

import src.models.ingredients.cheese.*;
import src.models.ingredients.clams.*;
import src.models.ingredients.dough.*;
import src.models.ingredients.sauce.*;

public class NYPizzaIngredients implements PizzaIngredientsFactory {
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Clam createClam() {
        return new FreshClam();
    }

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
