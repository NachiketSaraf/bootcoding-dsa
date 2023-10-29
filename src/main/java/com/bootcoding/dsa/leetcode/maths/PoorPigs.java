package com.bootcoding.dsa.leetcode.maths;

public class PoorPigs {
    public static void main(String[] args) {
       int buckets = 4;
       int minutesToDie = 15;
       int minutesToTest = 15;
        System.out.println(poorPigs(buckets,minutesToDie,minutesToTest));
    }
    public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int test = minutesToTest/minutesToDie;
        int i=0;
        while(Math.pow(test+1,i)< buckets)
        {
            i++;
        }
        return i;
    }
}
