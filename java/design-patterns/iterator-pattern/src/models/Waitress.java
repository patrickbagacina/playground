package src.models;

public class Waitress {
    Menu breakfastMenu;
    Menu dinnerMenu;

    public Waitress(Menu breakfastMenu, Menu dinnerMenu) {
        this.breakfastMenu = breakfastMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator breakfastIterator = breakfastMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();

        System.out.println("Menu\n----------\nBREAKFAST");
        printMenu(breakfastIterator);

        System.out.println("\nDINNER");
        printMenu(dinnerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
