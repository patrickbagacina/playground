package src.models.ingredients;

import src.models.ingredients.cheese.Cheese;
import src.models.ingredients.clams.Clam;
import src.models.ingredients.dough.Dough;
import src.models.ingredients.sauce.Sauce;

public interface PizzaIngredientsFactory {
    public Cheese createCheese();

    public Clam createClam();

    public Dough createDough();

    public Sauce createSauce();
}
