package com.bootcoding.dsa.leetcode.array;

public class CountingBits {
    public static void main(String[] args) {
        int[] ans = countBits(5);
        for (int  a: ans) {
            System.out.println(a);
        }
    }
    public static  int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0 ; i<=n ;i++){
            int num = i;
            int count = 0;
            while(num != 0){
                count+=num%2;
                num = num/2;
            }
            ans[i] = count;
        }
        return ans;
    }
}
