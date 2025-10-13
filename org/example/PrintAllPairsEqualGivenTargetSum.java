package org.example;

import java.util.HashMap;
//Given array and target sum, print pairs which are equal to given sum
public class PrintAllPairsEqualGivenTargetSum {
    public static void main(String[] args) {
        int[] arr = {15,12,6,3,9,0,1}; // 6+3 = 9 and 9+0 = 9
        int sum = 9;
        int n = arr.length;
        int count = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<n-1;i++){
            if(hm.containsKey(sum - arr[i])){
                count++;

                System.out.println("pair found: " + (sum - arr[i])+ " "+arr[i]);
            }
            hm.put(arr[i],i);

        }

        System.out.println("no of pairs: "+count);
    }
}

//o/p :
// pair found: 6 3
//pair found: 9 0
//no of pairs: 2