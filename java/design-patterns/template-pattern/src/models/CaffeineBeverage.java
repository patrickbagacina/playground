package src.models;

public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();

        brew();

        pourInCup();

        addCondiments();

        // can call hook() anywhere here on this template method
        // hook();
    }

    void boilWater() {
        System.out.println("Boiling water...");
    }

    void pourInCup() {
        System.out.println("Pouring in cup...");
    }

    // defer implementation to subclasses
    abstract void brew();

    abstract void addCondiments();

    // empty method which can be overriden by subclasses
    void hook() {
    }
}
