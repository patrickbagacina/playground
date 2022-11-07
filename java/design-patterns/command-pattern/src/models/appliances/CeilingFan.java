package src.models.appliances;

public class CeilingFan {
    private String location;

    // speed of the fan
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + " Ceiling Fan set to HIGH...");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " Ceiling Fan set to MEDIUM...");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + " Ceiling Fan set to LOW...");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + " Ceiling Fan is off...");
    }

    public int getSpeed() {
        return speed;
    }

}
