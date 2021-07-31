package com.ivanboyukliev.creationalpatterns.abstractfactorymethod.courseassignment;

interface IMovieFactory {
    IHollyWoodMovie getHollyWoodMovie();
    IBollywoodMovie getBollyWoodMovie();
}

class ActionMovieFactory implements IMovieFactory {
    @Override
    public IHollyWoodMovie getHollyWoodMovie() {
        return new HollyWoodActionMovie();
    }

    @Override
    public IBollywoodMovie getBollyWoodMovie() {
        return new BollyWoodActionMovie();
    }
}

class ComedyMovieFactory implements IMovieFactory {
    @Override
    public IHollyWoodMovie getHollyWoodMovie() {
        return new HollyWoodComedyMovie();
    }

    @Override
    public IBollywoodMovie getBollyWoodMovie() {
        return new BollyWoodComedyMovie();
    }
}






