package src;

import src.models.*;

public class RestaurantSimulator {
    public static void main(String[] args) {
        BreakfastMenu breakfastMenu = new BreakfastMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        Waitress waitress = new Waitress(breakfastMenu, dinnerMenu);

        waitress.printMenu();
    }
}
