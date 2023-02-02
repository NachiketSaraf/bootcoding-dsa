package com.bootcoding.dsa.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(candies,extraCandies);
        for (int i = 0 ; i < result.size();i++){
            System.out.println(result.get(i));
        }
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList res = new ArrayList<>();
        int large = candies[0];
        for (int i = 0 ; i < candies.length;i++){
            if (candies[i]>large){
                large = candies[i];
            }
        }
        for (int i = 0; i < candies.length;i++){
            if ( (candies[i] + extraCandies) >= large ){
                res.add(true);
            }
            else {
                res.add(false);
            }
        }
        return res;
    }
}
