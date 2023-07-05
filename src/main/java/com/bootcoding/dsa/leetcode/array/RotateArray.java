package com.bootcoding.dsa.leetcode.array;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
        print(nums);
    }public static void reverse(int[] arr,int indx){

        for (int i = 0; i < indx/2; i++){
            int temp = arr[i];
            arr[i] = arr[indx-i];
            arr[indx-i] = temp;
        }
    }
    public static void rotate(int[] nums, int k) {
        for (int i = 0; i < k/2+1; i++){
            int temp = nums[i];
            nums[i] = nums[k-i];
            nums[k-i] = temp;
        }
        int j =0;
        for (int i = k+1; i < nums.length/2; i++){
            int temp = nums[i];
            nums[i] = nums[nums.length-1-j];
            nums[nums.length-1-j] = temp;
            j++;
        }
        for (int i = 0; i < nums.length/2; i++){
            int temp = nums[i];
            nums[i] = nums[(nums.length-1)-i];
            nums[(nums.length-1)-i] = temp;
        }
//        while (k!=0){
//            int temp = nums[nums.length-1];
//            for (int i= nums.length-1;i>0;i--){
//                nums[i] = nums[i-1];
//            }
//            nums[0]=temp;
//            k--;
//        }
//        print(nums);
    }
    public static void print(int[] nums){
        for (int i = 0;i< nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
