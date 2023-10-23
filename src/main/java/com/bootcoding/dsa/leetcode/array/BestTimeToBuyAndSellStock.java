package com.bootcoding.dsa.leetcode.array;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] p ={7,1,5,3,6,4};
        int[] p1 ={8,2,6,4,7,5};
        System.out.println(maxProfit(p));
    }
    public static int maxProfit(int[] prices) {
        int mini = prices[0];
        int profit = 0;
        for (int i = 0; i< prices.length; i++){
            int cost = prices[i] -  mini;
            profit = Math.max(profit,cost);
            mini = Math.min(mini,prices[i]);
        }
        return profit;
    }
}
