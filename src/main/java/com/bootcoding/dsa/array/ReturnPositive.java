package com.bootcoding.dsa.array;

public class ReturnPositive {
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -4};

        int[] pos = findPositiveElements(nums);

        System.out.println("Positive Array");
        for (int i = 0; i < pos.length; i++) {
            System.out.println(pos[i]);
        }

    }

    public static int[] findPositiveElements(int[] nums) {
        int countOfPos = getPositiveElements(nums) ;
        int[] posCollector = new int[countOfPos];
        int j =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                posCollector[j++] = nums[i];
            }
        }
        return posCollector;

    }
    public static int getPositiveElements(int[] nums){
        int counter = 0;
        for (int i =0; i<nums.length;i++){
            if(nums[i]>0) {
                counter++;
            }
        }
        return counter;

    }



}