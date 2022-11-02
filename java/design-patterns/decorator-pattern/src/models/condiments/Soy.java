package src.models.condiments;

import src.models.beverages.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage b) {
        beverage = b;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return beverage.cost() + 0.15;
    }
}
