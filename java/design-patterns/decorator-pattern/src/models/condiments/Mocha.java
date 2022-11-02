package src.models.condiments;

import src.models.beverages.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage b) {
        beverage = b;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + 0.20;
    }
}
