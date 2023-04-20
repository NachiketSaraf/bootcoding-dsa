package com.bootcoding.dsa.array;

public class CubeOfArray {
    public static void main(String[] args) {
        int[] array = {1,2,-3};
        int[] cube = Cube(array);
        for(int i =0; i<cube.length;i++){
            System.out.println(cube[i]);
        }
    }
    public static int[] Cube(int[] array){
        int[] cube = new int[array.length];
        for (int i = 0; i<array.length;i++){
            cube[i] = array[i]*array[i]*array[i];
        }
        return cube;
    }
}
