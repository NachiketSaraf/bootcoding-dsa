package com.bootcoding.dsa.recursion;

public class EvenNo {
    public static void main(String[] args) {
        int num=50;
        printEven(num);
    }
    private static void printEven(int num){
        if(num==0){
            return;
        }
        printEven(num - 1);
        if (num%2==0) {

            System.out.println(num);
        }
    }

}
