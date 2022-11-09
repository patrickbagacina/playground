package src.models.ducks;

// adapter implements another interface
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    // overrides interface methods but use the class object's methods
    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        turkey.fly();
    }
}
