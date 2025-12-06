package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestConsecutiveSequenceInArray {
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 90, 45, 19, 12};
        System.out.println(longestConsecutive(arr));
    }

    private static int longestConsecutive(int[] arr) {
        int res = 0;
      //  int longest = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        for(int num :arr){
            if(set.contains(num) && !set.contains(num -1)){
                int curr = num;
                int count = 0;

                while (set.contains(curr)){
                    set.remove(curr);
                    curr++;
                    count++;
                }
                res = Math.max(res,count);
            }


        }
        return res;
    }
}
