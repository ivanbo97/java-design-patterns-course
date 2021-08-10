package com.ivanboyukliev.structuralpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

// FlyweightFactory
public class RobotFactory {
    private Map<String, RobotInterface> robots = new HashMap<>();

    public int totalObjectsCreated() {
        return robots.size();
    }

    // Factory Method

    public RobotInterface getRobotFromFactory(String robotType) throws Exception {
        RobotInterface myRobot = null;

        if(robots.containsKey(robotType)){
            myRobot = robots.get(robotType);
            return myRobot;
        }
        switch (robotType){
            case "King":
                System.out.println("We do not have King Robot. We are going to create it...");
                myRobot = new Robot("King");
                robots.put("King",myRobot);
                break;
            case "Queen":
                System.out.println("We do not have Queen Robot. We are going to create it...");
                myRobot = new Robot("Queen");
                robots.put("Queen",myRobot);
                break;
            default:
                throw new Exception("Robot factory can create only King and Queen robots!!!");
        }
        return myRobot;
    }
}
