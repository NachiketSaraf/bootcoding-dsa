package com.bootcoding.dsa.array;

import java.util.Scanner;

public class MaxNoInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < numbers.length;i++){
            System.out.println("Enter array element " +(i+1));
            int number = sc.nextInt();
            numbers[i]=number;
        }
       int m = maxOfArray(numbers);
        System.out.println(maxOfArray(numbers));
    }
    private static int maxOfArray(int[] numbers){
        System.out.println("Maximum");
        int max = 0;
        for (int i = 0;i<numbers.length;i++){
            if (max<numbers[i]){
                max = numbers[i];
            }
        }
        return max;
    }
}
