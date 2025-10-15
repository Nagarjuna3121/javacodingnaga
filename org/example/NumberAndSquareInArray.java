package org.example;

import java.util.*;
//Print number and square in array
public class NumberAndSquareInArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 9, 16, 5, 25, 10};

        findNumbersWithSquares(arr);
    }

    public static void findNumbersWithSquares(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        for (int num : arr) {
            int square = num * num;
            if (set.contains(square)) {
                System.out.println(num + " → " + square);
            }
        }
    }
}

//i/p : {2, 3, 4, 9, 16, 5, 25, 10}
//o/p :
// 2 → 4
//3 → 9
//4 → 16
//5 → 25