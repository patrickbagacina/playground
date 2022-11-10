package src;

import src.models.*;

public class CoffeeBaristaSimulator {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();

        System.out.println("Preparing coffee....");
        coffee.prepareRecipe();

        System.out.println("\nPreparing tea....");
        tea.prepareRecipe();
    }
}
