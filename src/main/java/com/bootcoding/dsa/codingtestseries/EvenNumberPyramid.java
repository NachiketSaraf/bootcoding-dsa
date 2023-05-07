package com.bootcoding.dsa.codingtestseries;

public class EvenNumberPyramid {
    public static void main(String[] args) {
        printEvenNumber();
    }
    private static void printEvenNumber() {
        int row = 4;
        int even = 0;
        for (int i = 1 ; i<=row;i++){
            for (int j = row-i;j>0;j--) {
                System.out.print("  ");
            }
            for (int k = 0;k<i;k++) {
                even=even+2;
                System.out.print("  "+even);
            }
            System.out.println();
        }
    }
}
