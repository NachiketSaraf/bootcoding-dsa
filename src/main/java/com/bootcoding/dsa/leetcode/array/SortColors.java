package com.bootcoding.dsa.leetcode.array;

public class SortColors {
    public static void main(String[] args) {
        int[] a = {2,0,2,1,1,0};
        int[] n = sortColors(a);
        for (int i = 0; i< n.length;i++){
            System.out.println(n[i]);
        }
    }

    public static int[] sortColors(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        int temp;
        while (mid<=high){
            switch (nums[mid]){
                case 0:{
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid]= temp;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp;
                    high--;
                    break;
                }
            }
        }
        return nums;
    }
}
