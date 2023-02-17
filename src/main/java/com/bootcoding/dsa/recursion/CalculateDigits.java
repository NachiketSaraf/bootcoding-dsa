package com.bootcoding.dsa.recursion;

import static java.lang.Math.log10;

public class CalculateDigits {
    public static void main(String[] args) {
        int a = 12345;
        System.out.println(digtis(a));
        int count = calcDigits(a);
        System.out.println(count);
    }
    public static int digtis(int a){
        int count = (int)(log10(a)+1);
        return count;
    }

    private static int calcDigits(int a) {
        if (a<10){
            return 1;
        }
        return 1+calcDigits(a/10);
    }
}
