package com.lisek.flyweight;

import java.util.Random;

public class Main {

    private static String[] playerType = {"T", "CT"};
    private static String[] weapons = {"AK47", "Maverick", "Glock", "Knife"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Player p = PlayerFactory.getPlayer(getRandPlayerType());
            p.assignWeapon(getRandWeapon());
            p.mission();
        }
        System.out.println("Map size: " + PlayerFactory.hm.size());
    }

    private static String getRandPlayerType() {
        Random r = new Random();
        int randInt = r.nextInt(playerType.length);
        return playerType[randInt];
    }

    private static String getRandWeapon() {
        Random r = new Random();
        int randInt = r.nextInt(weapons.length);
        return weapons[randInt];
    }
}
