package src;

import src.models.theater.*;
import src.models.ducks.*;

public class AdapterFacadeSimulator {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        CdPlayer cdPlayer = new CdPlayer();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();
        Tuner tuner = new Tuner();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                amplifier,
                cdPlayer,
                dvdPlayer,
                projector,
                tuner);

        System.out.println("\n----------------------HOME THEATER SIMULATOR-------------------------\n");

        homeTheater.watchMovie();
        homeTheater.endMovie();

        homeTheater.listenToCD();
        homeTheater.endCD();

        homeTheater.listenToRadio();
        homeTheater.endRadio();

        System.out.println("\n----------------------DUCK SIMULATOR-------------------------\n");

        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says....");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says....");
        testDuck(duck);

        System.out.println("\nThe Turkey Adapter says....");
        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}