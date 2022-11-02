package src.models.condiments;

import src.models.beverages.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage b) {
        beverage = b;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return beverage.cost() + 0.10;
    }
}
