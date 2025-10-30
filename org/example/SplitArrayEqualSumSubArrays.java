package org.example;

import java.util.Arrays;

public class SplitArrayEqualSumSubArrays {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0};
        splitArray(arr);
    }

    static void splitArray(int[] arr) {
        int totalSum = 0;
        for (int num : arr)
            totalSum += num;

        int leftSum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            leftSum += arr[i];
            int rightSum = totalSum - leftSum;

            if (leftSum == rightSum) {
                System.out.println("Array can be split after index " + i);
                System.out.println("Left part: " + Arrays.toString(Arrays.copyOfRange(arr, 0, i + 1)));
                System.out.println("Right part: " + Arrays.toString(Arrays.copyOfRange(arr, i + 1, arr.length)));
                return;
            }
        }

        System.out.println("Array cannot be split into two parts with equal sum.");
    }
}

