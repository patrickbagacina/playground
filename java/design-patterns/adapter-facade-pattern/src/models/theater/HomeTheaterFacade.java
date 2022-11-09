package src.models.theater;

public class HomeTheaterFacade {
    Amplifier amplifier;
    CdPlayer cdPlayer;
    DvdPlayer dvdPlayer;
    Projector projector;
    Tuner tuner;

    public HomeTheaterFacade(
            Amplifier amplifier,
            CdPlayer cdPlayer,
            DvdPlayer dvdPlayer,
            Projector projector,
            Tuner tuner) {
        this.amplifier = amplifier;
        this.cdPlayer = cdPlayer;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.tuner = tuner;
    }

    public void watchMovie() {
        amplifier.on();
        projector.on();
        tuner.on();
    }

    public void endMovie() {
        amplifier.off();
        projector.off();
        tuner.off();
    }

    public void listenToCD() {
        amplifier.on();
        cdPlayer.on();
        tuner.on();
    }

    public void endCD() {
        amplifier.off();
        cdPlayer.off();
        tuner.off();
    }

    public void listenToRadio() {
        amplifier.on();
        dvdPlayer.on();
        tuner.on();
    }

    public void endRadio() {
        amplifier.off();
        dvdPlayer.off();
        tuner.off();
    }
}
