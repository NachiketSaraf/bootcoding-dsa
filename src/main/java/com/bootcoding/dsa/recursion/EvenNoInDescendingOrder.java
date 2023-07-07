package com.bootcoding.dsa.recursion;

public class EvenNoInDescendingOrder {
    public static void main(String[] args) {
        int num=50;
        printEven(num);
    }
    private static void printEven(int num){
        if(num==0){
            return;
        }
        if (num%2==0) {

            System.out.println(num);
        }
        printEven(num - 1);

    }

}
