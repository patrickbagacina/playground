package src.models;

import src.models.behaviors.*;

public abstract class Duck {
    private FlyingBehavior flyingBehavior;
    private QuackingBehavior quackingBehavior;

    public void setFlyingBehavior(FlyingBehavior behavior) {
        this.flyingBehavior = behavior;
    }

    public void performFly() {
        this.flyingBehavior.fly();
    }

    public void setQuackingBehavior(QuackingBehavior behavior) {
        this.quackingBehavior = behavior;
    }

    public void performQuack() {
        this.quackingBehavior.quack();
    }

    public void display() {}
}