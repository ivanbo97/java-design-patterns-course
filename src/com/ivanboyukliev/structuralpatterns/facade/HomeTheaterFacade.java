package com.ivanboyukliev.structuralpatterns.facade;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    private Projector projector;
    private TheaterLights theaterLights;
    private Screen screen;
    private PopcornPopper popcornPopper;


    public void watchMovie(String movie) {
        System.out.println("Get ready to watch the movie....");

        popcornPopper.on();
        popcornPopper.pop();

        theaterLights.dim(10);
        screen.down();

        projector.on();
        projector.wideScreenMode();

        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);

        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theatre down...");
        popcornPopper.off();
        theaterLights.off();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }

    public void setAmplifier(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void setCdPlayer(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public void setProjector(Projector projector) {
        this.projector = projector;
    }

    public void setTheaterLights(TheaterLights theaterLights) {
        this.theaterLights = theaterLights;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setPopcornPopper(PopcornPopper popcornPopper) {
        this.popcornPopper = popcornPopper;
    }

    public Amplifier getAmplifier() {
        return amplifier;
    }

    public Tuner getTuner() {
        return tuner;
    }

    public DvdPlayer getDvdPlayer() {
        return dvdPlayer;
    }

    public CdPlayer getCdPlayer() {
        return cdPlayer;
    }

    public Projector getProjector() {
        return projector;
    }

    public TheaterLights getTheaterLights() {
        return theaterLights;
    }

    public Screen getScreen() {
        return screen;
    }

    public PopcornPopper getPopcornPopper() {
        return popcornPopper;
    }
}
