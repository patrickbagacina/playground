package src.models.pizza;

import src.models.ingredients.cheese.Cheese;
import src.models.ingredients.clams.Clam;
import src.models.ingredients.dough.Dough;
import src.models.ingredients.sauce.Sauce;

public abstract class Pizza {
    String name;
    Dough dough;
    Clam clam;
    Cheese cheese;
    Sauce sauce;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 mins at 350");
    }

    public void cut() {
        System.out.println("Cutting pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official Pizza Store box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + "\nIngredients: " + dough.getDescription() + ", " + clam.getDescription() + ", "
                + cheese.getDescription() + ", " + sauce.getDescription();
    }
}
