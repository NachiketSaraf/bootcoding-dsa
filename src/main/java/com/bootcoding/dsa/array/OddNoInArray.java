package com.bootcoding.dsa.array;

import java.util.Scanner;

public class OddNoInArray {
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
        oddInArray(numbers);
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
}
