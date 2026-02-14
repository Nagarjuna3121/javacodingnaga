package org.example;

public class ArrayEquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println(equilibriumIndex(arr));
    }

    private static int equilibriumIndex(int[] arr) {
        int n = arr.length;
        int prefSum = 0;
        int total = 0;

        for(int sum : arr){
            total = total + sum;
        }

        for (int i = 0; i < n; i++) {
            int suffSum = total - prefSum - arr[i];
            if(prefSum == suffSum){
                return i;
            }
            prefSum = prefSum + arr[i];
        }
        return -1;
    }
}
