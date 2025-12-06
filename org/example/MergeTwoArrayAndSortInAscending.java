package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrayAndSortInAscending {

    public static void main(String[] args) {
        int[] arr1 = {5, 1, 9, 3};
        int[] arr2 = {8, 2, 7, 4};

        int[] merged = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().toArray();
        System.out.println("mergedP: "+Arrays.toString(merged));
    }


}
