package com.ivanboyukliev.structuralpatterns.facade.facadebuilder;

public class BuilderDirector {

    public void createTheater(ITheaterBuilder theaterBuilder){
        theaterBuilder.createAmplifier();
        theaterBuilder.createTuner();
        theaterBuilder.createDvd();
        theaterBuilder.createCd();
        theaterBuilder.createProjector();
        theaterBuilder.createTheaterLights();
        theaterBuilder.createScreen();
        theaterBuilder.createPopcornPopper();
    }
}
