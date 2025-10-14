package org.example;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class MergeTwoArraysIntoOneAndRemoveDuplicates {
    public static void main(String[] args) {
        int[] first = {10, 20, 30};
        int[] second = {20, 30, 40, 50};
        //  o/p : [10, 20, 30, 40, 50]
        Set<Integer> orderedUnique = new LinkedHashSet<>();
        for (int value : first) {
            orderedUnique.add(value);
        }
        for (int value : second) {
            orderedUnique.add(value);
        }

        int[] result = new int[orderedUnique.size()];
        int index = 0;
        for (int value : orderedUnique) {
            result[index++] = value;
        }

        System.out.println(Arrays.toString(result));
    }
}

