package com.ivanboyukliev.structuralpatterns.facade.facadebuilder;

import com.ivanboyukliev.structuralpatterns.facade.*;

public class HomeTheaterBuilder implements ITheaterBuilder {
    private HomeTheaterFacade homeTheater;

    public HomeTheaterBuilder(HomeTheaterFacade homeTheater) {
        this.homeTheater = homeTheater;
    }

    @Override
    public void createAmplifier() {
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        homeTheater.setAmplifier(amp);
    }

    @Override
    public void createTuner() {
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", homeTheater.getAmplifier());
        homeTheater.setTuner(tuner);
    }

    @Override
    public void createDvd() {
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", homeTheater.getAmplifier());
        homeTheater.setDvdPlayer(dvd);
    }

    @Override
    public void createCd() {
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", homeTheater.getAmplifier());
        homeTheater.setCdPlayer(cd);
    }

    @Override
    public void createProjector() {
        Projector projector = new Projector("Top-O-Line Projector", homeTheater.getDvdPlayer());
        homeTheater.setProjector(projector);
    }

    @Override
    public void createTheaterLights() {
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        homeTheater.setTheaterLights(lights);
    }

    @Override
    public void createScreen() {
        Screen screen = new Screen("Theater Screen");
        homeTheater.setScreen(screen);
    }

    @Override
    public void createPopcornPopper() {
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");
        homeTheater.setPopcornPopper(popper);
    }

    @Override
    public HomeTheaterFacade getHomeTheaterFacade() {
        return homeTheater;
    }
}
