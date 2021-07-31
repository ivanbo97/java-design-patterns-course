package com.ivanboyukliev.creationalpatterns.abstractfactorymethod.courseassignment;

public interface IHollyWoodMovie {
    String getMovieName();
}


class HollyWoodComedyMovie implements IHollyWoodMovie{
    @Override
    public String getMovieName() {
        return "HollyWood Movie : Office Space!";
    }
}

class HollyWoodActionMovie implements IHollyWoodMovie{
    @Override
    public String getMovieName() {
        return "HollyWood Movie : Rush Hour!";
    }
}