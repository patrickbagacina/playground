package src.models.condiments;

import src.models.beverages.Beverage;

public class SteamedMilk extends CondimentDecorator {

    public SteamedMilk(Beverage b) {
        beverage = b;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        return beverage.cost() + 0.10;
    }
}
