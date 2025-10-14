package org.example;

//package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//print indexes which are equal to target sum
public class PairIndicesSumArrayList {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 3, 6};
        int target = 9;// index 0 = 2,index 1 = 7  AND index 4 = 3, index 5 = 6
        List<int[]> pairs = findPairs(nums,target);

        if (pairs.isEmpty()) {
            System.out.println("no pairs found");
        }else{
            System.out.println("pairs of indices are: ");
            for(int[] pair : pairs){
                System.out.println(Arrays.toString(pair));
            }
        }
    }

    private static List<int[]> findPairs(int[] nums, int target) {

        List<int[]> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j < n; j++) {
                if(nums[i] + nums[j] == target){
                    result.add(new int[]{i,j});
                }

            }

        }


        return result;
    }
}

//o/p : [0, 1],[4, 5]


