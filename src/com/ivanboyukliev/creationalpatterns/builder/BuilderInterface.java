package com.ivanboyukliev.creationalpatterns.builder;

public interface BuilderInterface {
     void buildBody();
     void insertWheels();
     void addHeadlights();
     Product getVehicle();
}
