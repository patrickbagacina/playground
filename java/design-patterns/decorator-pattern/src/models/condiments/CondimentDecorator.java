package src.models.condiments;

import src.models.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
