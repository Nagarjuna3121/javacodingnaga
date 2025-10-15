package org.example;

import java.util.*;

//A resturant has 4 items A=250,B=20,C=10,d=8 find out max sold item
public class MaxSoldItemInHotelMenu {
    public static void main(String[] args) {
        // Store items and their values in a map
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 250);
        items.put("B", 20);
        items.put("C", 10);
        items.put("D", 8);

        // Find the entry with maximum value
        Map.Entry<String, Integer> maxEntry = items.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        if (maxEntry != null) {
            System.out.println("Max sold item: " + maxEntry.getKey() + " = " + maxEntry.getValue());
        } else {
            System.out.println("No items found");
        }
    }
}
