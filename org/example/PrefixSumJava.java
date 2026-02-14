package org.example;

import java.util.ArrayList;
//o(n) time and o(n) space
public class PrefixSumJava {
    public static void main(String[] args) {
        int[] arr = {10,20,5,15,10};
        ArrayList<Integer> al = prefixSum(arr);

        for(int i : al){
            System.out.println(i+ " ");
        }

    }

    private static ArrayList<Integer> prefixSum(int[] arr) {

        int n = arr.length;
        ArrayList<Integer> prefixsum = new ArrayList<>();
        prefixsum.add(arr[0]);

        for (int i = 1; i < n; i++) {
            prefixsum.add(prefixsum.get(i - 1) + arr[i]);
        }

        return prefixsum;
    }
}
