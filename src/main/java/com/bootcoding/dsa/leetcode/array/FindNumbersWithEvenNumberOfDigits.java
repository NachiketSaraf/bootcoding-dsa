package com.bootcoding.dsa.leetcode.array;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    } public static int findNumbers(int[] nums) {
        int evenCounter = 0 ;
        int div;
        for (int i = 0;i < nums.length; i++){
            int digitsCounter = 0;
            int n = nums[i];
            while (n!=0){
                div = n/10;
                n = div;
                digitsCounter++;
            }
            if(digitsCounter%2 == 0){
                evenCounter++;
            }
        }
        return evenCounter;
    }
}
