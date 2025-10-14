package org.example;

public class MajorityElementApproach2 {
    static int majorityElement(int[] arr) {

        int n = arr.length;
        int candidate = -1;
        int count = 0;

        // Find a candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            }
            else if (num == candidate) {
                count++;
            }
            else {
                count--;
            }
        }

        // Validate the candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        // If count is greater than n / 2, return
        // the candidate; otherwise, return -1
        if (count > n / 2) {
            return candidate;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 5,1}; // here 1 occurs more than n/2 times.so its majority
        System.out.println(majorityElement(arr));
    }
}

