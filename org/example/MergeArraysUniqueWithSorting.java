package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArraysUniqueWithSorting {
    public static void main(String[] args) {
        int[] a = {4, 2, 5, 2, 4};
        int[] b = {5, 6, 4, 7};

        int[] res = mergeUniqueSorted(a, b);
        System.out.println(Arrays.toString(res));
    }

    private static int[] mergeUniqueSorted(int[] a, int[] b) {
        boolean[] seen = new boolean[11];

        for (int num : a) {
            seen[num] = true;
        }

        for (int num : b) {
            seen[num] = true;
        }


        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            if (seen[i]) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }


}
