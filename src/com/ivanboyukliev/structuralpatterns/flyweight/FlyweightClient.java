package com.ivanboyukliev.structuralpatterns.flyweight;

import java.util.Random;

public class FlyweightClient {
    public static void main(String[] args) throws Exception {
        RobotFactory robotFactory = new RobotFactory();
        System.out.println("* * * Flyweight Design Pattern * * ");

        Robot robot;

        // King Robots
        for (int i = 0; i < 3; i++) {
            robot = (Robot) robotFactory.getRobotFromFactory("King");
            robot.setColor(getRandomColor());
            robot.print();
        }

        // Queen Robots
        for (int i = 0; i < 3; i++) {
            robot = (Robot) robotFactory.getRobotFromFactory("Queen");
            robot.setColor(getRandomColor());
            robot.print();
        }

        int numOfRobots = robotFactory.totalObjectsCreated();
        System.out.println("\n Total Objects: " + numOfRobots);
    }

    private static  String getRandomColor(){
        Random random = new Random();

        int randomNum = random.nextInt(20);
        if(randomNum %2==0){
            return "red";
        }
        return "green";
    }
}
