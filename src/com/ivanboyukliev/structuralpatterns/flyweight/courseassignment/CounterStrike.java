package com.ivanboyukliev.structuralpatterns.flyweight.courseassignment;


import java.util.Random;

public class CounterStrike {
    public static void main(String[] args) {

        PlayerFactory playerFactory = new PlayerFactory();

        System.out.println("Creating counter terrorists..");
        for (int i = 0; i < 3; i++) {
            Player counterTerrorist = null;
            try {
                counterTerrorist = playerFactory.getPlayer("Counter Terrorist");
            } catch (Exception e) {
                e.printStackTrace();
            }
            counterTerrorist.assignWeapon(getRandomWeapon());
            System.out.print("|");
            counterTerrorist.mission();
            System.out.println();
        }

        System.out.println("===Counter Terrorists created===");

        System.out.println("Creating terrorists..");
        for (int i = 0; i < 6; i++) {
            Player terrorist = null;
            try {
                terrorist = playerFactory.getPlayer("Terrorist");
            } catch (Exception e) {
                e.printStackTrace();
            }
            terrorist.assignWeapon(getRandomWeapon());
            System.out.print("|");
            terrorist.mission();
            System.out.println();
        }

        System.out.println("===Terrorists created===");

        System.out.println("Total number of player in the game: " + playerFactory.getTotalNumberOfPlayers());


    }

    private static String getRandomPlayer() {
        Random random = new Random();

        int randomNum = random.nextInt(20);
        if (randomNum % 2 == 0) {
            return "Terrorist";
        }
        return "Counter Terrorist";
    }

    private static String getRandomWeapon() {
        Random random = new Random();

        int randomNum = random.nextInt(20);
        if (randomNum % 2 == 0) {
            return "AK-47";
        }
        return "M4A1";
    }
}
