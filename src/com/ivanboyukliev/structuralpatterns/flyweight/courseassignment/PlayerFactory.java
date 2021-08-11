package com.ivanboyukliev.structuralpatterns.flyweight.courseassignment;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory
public class PlayerFactory {
    Map<String, Player> players;

    PlayerFactory() {
        players = new HashMap<>();
    }

    public Player getPlayer(String playerType) throws Exception {
        if (playerType == null) {
            throw new Exception("Player type can't be null");
        }

        if (players.containsKey(playerType)) {
            return players.get(playerType);
        }

        if (playerType.equalsIgnoreCase("Counter Terrorist")) {
            CounterTerrorist counterTerrorist = new CounterTerrorist();
            players.put(playerType, counterTerrorist);
            return counterTerrorist;
        }

        if (playerType.equalsIgnoreCase("Terrorist")) {
            Terrorist terrorist = new Terrorist();
            players.put("Terrorist", terrorist);
            return terrorist;
        }

        System.out.println("No such player type in the game");
        return null;
    }

    public int getTotalNumberOfPlayers(){
        return players.size();
    }
}
