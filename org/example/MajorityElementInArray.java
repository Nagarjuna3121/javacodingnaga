package org.example;

//Majority element is a element which occurs more than n/2 times, n is size of array
public class MajorityElementInArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 2, 1, 2,2};//here n is 7 and n/2 is 3.5 and 2 occurs 4 times so its majority
        System.out.println(majorityEle(arr));
    }

    private static int majorityEle(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n/2) {
                return arr[i];
            }

        }
        return -1;
    }
}




