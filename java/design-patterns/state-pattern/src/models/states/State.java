package src.models.states;

public interface State {
    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}
