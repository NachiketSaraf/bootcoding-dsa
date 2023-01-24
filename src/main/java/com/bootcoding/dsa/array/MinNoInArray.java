package com.bootcoding.dsa.array;

import java.util.Scanner;

public class MinNoInArray {
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
        int m = minOfArray(numbers);
        System.out.println(m);
    }
    private static int minOfArray(int[] numbers){
        System.out.println("Minimum");
        int min = numbers[0];
        for (int i = 0;i<numbers.length;i++){
            if (min>numbers[i]){
                min = numbers[i];
            }
        }
        return min;
    }
}
