package org.example;

//o(n) time and o(1) space
public class ShiftZerosToBeginning1 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 5, 0, 3, 0, 2};

        shiftZerosToStart(arr);

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    private static void shiftZerosToStart(int[] arr) {
        int j = arr.length - 1;

        // Move non-zero elements to the end
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[j--] = arr[i];
            }
        }

        // Fill the rest with zeros
        while (j >= 0) {
            arr[j--] = 0;
        }
    }
}

