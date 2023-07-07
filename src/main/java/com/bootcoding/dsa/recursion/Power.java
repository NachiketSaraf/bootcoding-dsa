package com.bootcoding.dsa.recursion;

public class Power {
    public static void main(String[] args) {
        int n = 3;
        int p = 4;
        int c =calcPower(p,n);
        System.out.println(c);

    }

    private static int calcPower(int p, int n) {

        if (p==0) return 1;
        return n* calcPower(p-1,n);

    }
}
