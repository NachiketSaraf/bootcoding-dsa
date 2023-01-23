package com.bootcoding.dsa.leetcode.array;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        int[] a = getConcatenation(nums);
        for (int i =0; i < a.length ; i++){
            System.out.println(a[i]);
        }
    }
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2] ;
        int indx=0;
//        for (int i = 0 ; i<ans.length;i++){
//            for (int j = 0 ; j < nums.length; j++) {
//                ans[indx] = nums[j];
//                if (indx < ans.length-1) {
//                    indx++;
//                }
//            }
//        }
        int j = 0;
        for (int i = 0 ; i<ans.length;i++){
            if(j >= ans.length/2){
                j = 0;
            }
            ans[i] = nums[j++];

        }

        return ans;
    }
}
