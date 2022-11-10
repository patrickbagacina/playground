package src.models;

public class Coffee extends CaffeineBeverage {
    // adds own implementation of superclass methods for the template method
    void brew() {
        System.out.println("Dripping coffee through filter...");
    }

    void addCondiments() {
        System.out.println("Adding sugar and milk...");
    }
}
