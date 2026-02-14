package org.example;

public class BuyAndSellStockProblem {
    public static void main(String[] args) {
        int[] prices = { 99, 97, 101, 103, 96, 102, 100 };
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {

        int n = prices.length;
        int totProfit  = 0;

        for(int i = 1;i<n;i++){
            if(prices[i] > prices[i-1]){
                totProfit += prices[i] - prices[i-1];
            }
        }
        return totProfit;
    }
}
