package com.ivanboyukliev.structuralpatterns.facade;

import com.ivanboyukliev.structuralpatterns.facade.facadebuilder.BuilderDirector;
import com.ivanboyukliev.structuralpatterns.facade.facadebuilder.HomeTheaterBuilder;
import com.ivanboyukliev.structuralpatterns.facade.facadebuilder.ITheaterBuilder;

public class Client {
    public static void main(String[] args) {

        BuilderDirector builderDirector = new BuilderDirector();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        ITheaterBuilder homeTheaterBuilder = new HomeTheaterBuilder(homeTheaterFacade);

        builderDirector.createTheater(homeTheaterBuilder);

        homeTheaterFacade.watchMovie("Pursuit of happiness");
        homeTheaterFacade.endMovie();
    }
}
