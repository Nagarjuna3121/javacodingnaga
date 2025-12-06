package org.example;

import java.util.*;

public class MissingElementsInRange {

    public static List<Integer> findMissing(int[] arr, int start, int end) {
        Set<Integer> set = new HashSet<>();
        List<Integer> missing = new ArrayList<>();

        // Add all numbers to the set
        for (int num : arr) {
            set.add(num);
        }

        // Check which numbers in range are missing
        for (int i = start; i <= end; i++) {
            if (!set.contains(i)) {
                missing.add(i);
            }
        }

        return missing;
    }

    public static void main(String[] args) {
        int[] arr = {-8, 7, 1, 2, 8, 4, 5};
        System.out.println(findMissing(arr, 1, 10)); // [6, 9, 10]
    }
}

