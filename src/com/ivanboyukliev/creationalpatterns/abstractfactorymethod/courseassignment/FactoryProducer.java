package com.ivanboyukliev.creationalpatterns.abstractfactorymethod.courseassignment;

public class FactoryProducer {
    public static IMovieFactory getFactory(String movieType){
        if(movieType == null)
            return null;

        if(movieType.equalsIgnoreCase("ACTION")){
            return new ActionMovieFactory();
        }

        if (movieType.equalsIgnoreCase("COMEDY")){
            return new ComedyMovieFactory();
        }
        return null;
    }
}
