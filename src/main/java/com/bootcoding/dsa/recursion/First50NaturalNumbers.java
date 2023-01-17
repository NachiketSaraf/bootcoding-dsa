package com.bootcoding.dsa.recursion;

public class First50NaturalNumbers {
    public static void main(String[] args) {
        int num = 50;
        printNaturalNumber(num);

    }

    private static void printNaturalNumber(int num) {
        if(num==0){
            return;
        }

        printNaturalNumber(num-1);
        System.out.println(" "+num+" ");
    }
}
