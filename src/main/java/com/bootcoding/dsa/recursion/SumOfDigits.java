package com.bootcoding.dsa.recursion;
//WAP to find the sum of digits of a number using recursion
public class SumOfDigits {
    public static void main(String[] args) {
        int n = 123456;
        int s = printDigitsSum(n);
        System.out.println(s);
    }

    private static int printDigitsSum(int n) {
        if (n<10){
            return n;
        }
        return (n%10) +printDigitsSum(n/10);
    }
}
