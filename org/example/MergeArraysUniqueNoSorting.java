package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class MergeArraysUniqueNoSorting {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4,4,1,6};
        int[] arr2 = {5,1,2,7,9};

        int[] result = MergeTwoUnsortedArrys(arr1,arr2);

        System.out.println("result array: "+Arrays.toString(result));
    }

    private static int[] MergeTwoUnsortedArrys(int[] arr1, int[] arr2) {

        HashSet<Integer> lhs = new LinkedHashSet<>();
        //Arrays.sort(arr1);
        //Arrays.sort(arr2);

        for(int num : arr1){
            lhs.add(num);
        }

        for(int num : arr2){
            lhs.add(num);
        }

        int[] res = new int[lhs.size()];
                int index = 0;

        for(int num : lhs){
            res[index++] = num;
        }

        return res;
    }

}
