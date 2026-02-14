package org.example;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
       // coordinates point = new coordinates();
        HashMap<Coordinates, String> map = new HashMap<>();

        Coordinates home = new Coordinates(10, 20);
        Coordinates office = new Coordinates(30, 40);
        map.put(home, "Home Address");

        String location = map.get(home);
        System.out.println("location is: " + location);
    }
}
