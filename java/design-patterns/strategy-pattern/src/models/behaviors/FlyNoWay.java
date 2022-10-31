package src.models.behaviors;

public class FlyNoWay implements FlyingBehavior {
    public void fly() {
        System.out.println("I can't fly...");
    }
}