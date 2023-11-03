package com.bootcoding.dsa.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(29));
    }
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int value ;
        int lastDigit;

        while (true){
            value=0;
            while (n!=0){
                lastDigit = n%10;
                value += lastDigit*lastDigit;
                n /= 10;
            }
            if (value==1)return true;
            else if (set.contains(value)) {
                return false;
            }
            else {
                set.add(value);
                n= value;
            }
        }
    }
}
