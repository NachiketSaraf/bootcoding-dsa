package com.bootcoding.dsa.recursion;

public class CalculateDigits {
    public static void main(String[] args) {
        int a = 12345;
        int count = calcDigits(a);
        System.out.println(count);
    }

    private static int calcDigits(int a) {
        if (a<10){
            return 1;
        }
        return 1+calcDigits(a/10);
    }
}
