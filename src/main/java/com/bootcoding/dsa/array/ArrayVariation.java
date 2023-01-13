package com.bootcoding.dsa.array;

import java.util.Scanner;

public class ArrayVariation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < numbers.length;i++){
            System.out.println("Enter array element " +(i+1));
            int number = sc.nextInt();
            numbers[i]=number;
        }
        printArray(numbers);
        evenInArray(numbers);
        oddInArray(numbers);
        minOfArray(numbers);
        maxOfArray(numbers);

    }
    private static void printArray(int[] numbers){
        for (int i = 0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
    private static void evenInArray(int[] numbers){
        System.out.println("Even Number");
        for (int i = 0; i<numbers.length;i++){
            if (numbers[i]%2==0)
            {
                System.out.println(numbers[i]);
            }
        }

    }
    private static void oddInArray(int[] numbers){
        System.out.println("Odd Number");
        for (int i = 0; i<numbers.length;i++){
            if (numbers[i]%2 != 0)
            {
                System.out.println(numbers[i]);
            }
        }
    }
    private static void minOfArray(int[] numbers){
        System.out.println("Minimum");
        int min = numbers[0];
        for (int i = 0;i<numbers.length;i++){
            if (min>numbers[i]){
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
    private static void maxOfArray(int[] numbers){
        System.out.println("Maximum");
        int max = 0;
        for (int i = 0;i<numbers.length;i++){
            if (max<numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println(max);
    }


}
