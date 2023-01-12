package com.bootcoding.dsa.array;

public class SquareOfArray {
    public static void main(String[] args) {
        int[] array = {1,2,-3};
        int[] squ = Square(array);
        for(int i =0; i<squ.length;i++){
            System.out.println(squ[i]);
        }

        SquareOfArray squareOfArray = new SquareOfArray();
    }public static int[] Square(int[] array){
        int[] square = new int[array.length];
        for (int i = 0; i<array.length;i++){
            square[i] = array[i]*array[i];

        }
        return square;
    }
}
