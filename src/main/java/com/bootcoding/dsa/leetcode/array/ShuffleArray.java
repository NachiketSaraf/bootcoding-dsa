package com.bootcoding.dsa.leetcode.array;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] res = shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
        for (int k = 0; k < res.length; k++) {
            System.out.println(res[k]);
        }
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
        return result;
    }
}
// My approach
//    int x = 0;
//    int y =n;
//    int flag =0;
//    int[] ans = new int[nums.length];
//        for (int i =0;i< nums.length;i++){
//        if (flag == 0){
//            ans[i]=nums[x];
//            x++;
//            flag =1;
//        }
//        else {
//            ans[i]=nums[y];
//            y++;
//            flag=0;
//        }
//    }
//        return ans;

