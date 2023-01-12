package com.bootcoding.dsa.array;

import java.util.Scanner;

public class CheckSquareInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        int[] element= new int[size];
        for (int i = 0; i<element.length;i++){
            System.out.println("Enter element");
            element[i] = scanner.nextInt();
        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter number to check Square");
        int target = scanner1.nextInt();
        CheckSquareInArray checkSquareInArray = new CheckSquareInArray();
        boolean result = CheckSquareInArray.existSqur(element,target);
        System.out.println(result);

    }
    public static boolean existSqur(int[] element , int target){
        int square = target*target;
        for (int i = 0;i<element.length-1; i++){
            if(element[i]==square){
                return true;
            }

        }
        return false;
    }
}
