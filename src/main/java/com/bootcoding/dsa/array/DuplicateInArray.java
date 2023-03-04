package com.bootcoding.dsa.array;

public class DuplicateInArray {
    public static void main(String[] args) {

        int[] num = {1,2,7,2,9,0,1,5,9};

        printDuplicate(num);
    }

    private static void printDuplicate(int[] num) {
        for (int i = 0; i< num.length;i++){
            for (int j = i+1 ;j< num.length;j++){
                if (num[i]==num[j]){
                    System.out.println(num[j]);
                }
            }
        }
    }
}
