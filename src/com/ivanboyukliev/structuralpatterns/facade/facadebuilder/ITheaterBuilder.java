package com.ivanboyukliev.structuralpatterns.facade.facadebuilder;

import com.ivanboyukliev.structuralpatterns.facade.HomeTheaterFacade;

public interface ITheaterBuilder {
    void createAmplifier();
    void createTuner();
    void createDvd();
    void createCd();
    void createProjector();
    void createTheaterLights();
    void createScreen();
    void createPopcornPopper();
    HomeTheaterFacade getHomeTheaterFacade();
}


