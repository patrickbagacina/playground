package src;

public class ChocolateFactorySimulator {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance(); // getting an instace from the static method

        boiler.fill();
        boiler.boil();
        boiler.drain();
    }
}
