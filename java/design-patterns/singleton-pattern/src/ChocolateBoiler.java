package src;

public class ChocolateBoiler {
    private static ChocolateBoiler instance = new ChocolateBoiler(); // aggressive instantation - for multithreading
                                                                     // issues
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        // make constructor private so no other class can instantiate this
    }

    public static ChocolateBoiler getInstance() {
        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;

            System.out.println("Filling the boiler with chocolate and milk...");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("Draining the boiler...");
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
            System.out.println("Boiling the boiler...");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
