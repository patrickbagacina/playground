package src.models.behaviors;

public class MuteQuack implements QuackingBehavior {
    public void quack() {
        System.out.println("Silence...");
    }
}