package org.example.hashmap;

import java.util.HashMap;

public class basic {
    public static void main(String args[])
    {
        HashMap<String , Integer> mapCountry = new HashMap<>();
        mapCountry.put("india",100);
        mapCountry.put("china",120);
        System.out.println(mapCountry);
        System.out.println(mapCountry.get(120));
    }

}
