package com.ivanboyukliev.creationalpatterns.abstractfactorymethod.courseassignment;

public interface IBollywoodMovie {
    String getMovieName();
}

class BollyWoodActionMovie implements IBollywoodMovie {
    @Override
    public String getMovieName() {
        return "Bollywood movie: Mumbai saga";
    }
}

class BollyWoodComedyMovie implements IBollywoodMovie {
    @Override
    public String getMovieName() {
        return "Bollywood movie : Roohi";
    }
}



