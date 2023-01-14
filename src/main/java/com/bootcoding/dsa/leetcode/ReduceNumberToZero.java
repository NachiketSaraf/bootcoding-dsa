package com.bootcoding.dsa.leetcode;

public class ReduceNumberToZero {
    public static void main(String[] args) {

    }
    public int numberOfSteps(int num) {
        int count = 0;
        while(num != 0){
            if(num % 2 == 0){
                num = num / 2;
            }else {
                num = num-1;
            }
            count++;
        }
        return count;
    }
}
