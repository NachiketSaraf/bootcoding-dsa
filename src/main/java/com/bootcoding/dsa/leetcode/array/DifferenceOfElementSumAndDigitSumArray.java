package com.bootcoding.dsa.leetcode.array;

public class DifferenceOfElementSumAndDigitSumArray {
    public static void main(String[] args) {
        int[] nums = {1,15,6,3};
        int diff = differenceOfSum(nums);
        System.out.println(diff);
    }
    public static int differenceOfSum(int[] nums) {
        int sumOfElement = 0;
        int sOfDigitsOfElemnt= 0;
        int difference = 0;
        int div;
        for (int i =0 ; i<nums.length;i++){
            sumOfElement = sumOfElement + nums[i];
        }
        for (int j = 0; j<nums.length;j++){
            int rem=0;
            int n = nums[j];
            while (n!=0){
                div = n/10;
                rem = rem + n%10;
                n=div;
            }
            sOfDigitsOfElemnt = sOfDigitsOfElemnt + rem;
        }
        difference = sumOfElement - sOfDigitsOfElemnt;
        return difference;
    }
}
