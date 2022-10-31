package src.models.types;

import src.models.Duck;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a rubber duck...");
    }
}