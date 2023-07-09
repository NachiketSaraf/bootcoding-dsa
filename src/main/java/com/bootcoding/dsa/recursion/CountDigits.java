package com.bootcoding.dsa.recursion;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(count(57854678,0));
    }
    public static int count(int n, int totalDigits){
        if (n==0){
            return totalDigits;
        }
//        totalDigits++;
//        n=n/10;
        return count(n/10,totalDigits+1);
    }
}
