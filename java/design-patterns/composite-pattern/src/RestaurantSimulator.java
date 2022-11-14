package src;

import src.models.*;

public class RestaurantSimulator {
    public static void main(String[] args) {
        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Breakfast");
        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Dinner");
        MenuComponent cafeMenu = new Menu("Cafe Menu", "Cafe");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert");

        MenuComponent allMenus = new Menu("All Menus", "All menus combined");

        allMenus.add(breakfastMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        // add menu items - submenus

        dinnerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce",
                true,
                3.89));

        dinnerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with flakery crust",
                true,
                1.59));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
