package com.lisek.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {

    public static Map<String, Player> hm = new HashMap<String, Player>();

    public static Player getPlayer(String type) {
        Player p = null;

        if (hm.containsKey(type)) {
            p = hm.get(type);
        } else {
            switch (type) {
                case "T":
                    System.out.println("Terrorist created");
                    p = new Terrorist();
                    break;
                case "CT":
                    System.out.println("Counter Terrorist created");
                    p = new CounterTerrorist();
                    break;
                default:
                    System.out.println("Not expected");
            }
            hm.put(type, p);
        }
        return p;
    }
}
