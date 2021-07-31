package com.ivanboyukliev.creationalpatterns.abstractfactorymethod.courseassignment;

public class Client {
    public static void main(String[] args) {
        IMovieFactory actionFactory = FactoryProducer.getFactory("Comedy");
        IBollywoodMovie bollywoodMovie = actionFactory.getBollyWoodMovie();
        System.out.println(bollywoodMovie.getMovieName());
    }
}
