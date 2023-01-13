package com.bootcoding.dsa.array;

import java.util.Scanner;

public class EvenNoInArray {
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
        evenInArray(numbers);
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
}
