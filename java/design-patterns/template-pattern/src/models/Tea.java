package src.models;

public class Tea extends CaffeineBeverage {
    // adds own implementation of superclass methods for the template method
    void brew() {
        System.out.println("Steeping the tea...");
    }

    void addCondiments() {
        System.out.println("Adding lemon...");
    }
}
