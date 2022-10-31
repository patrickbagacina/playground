package src;

import src.models.Duck;
import src.models.behaviors.*;
import src.models.types.*;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck decoy = new DecoyDuck();
        decoy.setFlyingBehavior(new FlyNoWay());
        decoy.setQuackingBehavior(new Quack());

        decoy.display();
        decoy.performQuack();
        decoy.performFly();

        Duck mallard = new MallardDuck();
        mallard.setFlyingBehavior(new FlyWithWings());
        mallard.setQuackingBehavior(new Quack());

        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck redhead = new RedHeadDuck();
        redhead.setFlyingBehavior(new FlyWithWings());
        redhead.setQuackingBehavior(new Quack());

        redhead.display();
        redhead.performQuack();
        redhead.performFly();

        Duck rubber = new RubberDuck();
        rubber.setFlyingBehavior(new FlyNoWay());
        rubber.setQuackingBehavior(new Squeak());

        rubber.display();
        rubber.performQuack();
        rubber.performFly();
    }
}