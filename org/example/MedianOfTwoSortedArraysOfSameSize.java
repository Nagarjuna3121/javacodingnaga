package org.example;
/// Leetcode medium problem
///Time Complexity: O(log n), where n is the size of input array.
/// Auxiliary Space: O(1)
public class MedianOfTwoSortedArraysOfSameSize {
    public static void main(String[] args) {
        int[] arr1 = {1, 12, 15, 26, 38};
        int[] arr2 = {2, 13, 17, 30, 45};
        System.out.println(getMedian(arr1, arr2));
    }

    private static double getMedian(int[] a, int[] b) {

        int n = a.length;

        int low = 0;
        int high = n;
        while (low<=high){
          int mid1 = (low+high)/2;
          int mid2 = n-mid1;

            // Find elements to the left and right of partition in a
            int l1 = (mid1 == 0 ? Integer.MIN_VALUE : a[mid1 - 1]);
            int r1 = (mid1 == n ? Integer.MAX_VALUE : a[mid1]);

            // Find elements to the left and right of partition in b
            int l2 = (mid2 == 0 ? Integer.MIN_VALUE : b[mid2 - 1]);
            int r2 = (mid2 == n ? Integer.MAX_VALUE : b[mid2]);
            // If it is a valid partition
            if (l1 <= r2 && l2 <= r1)
                return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;

            // If we need to take fewer elements from a
            if (l1 > r2)
                high = mid1 - 1;

                // If we need to take more elements from a
            else
                low = mid1 + 1;
        }
        return 0;
    }
}
