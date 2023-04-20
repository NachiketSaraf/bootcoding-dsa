package com.bootcoding.dsa.array;

import java.util.Arrays;

public class CubeOfArray {
    public static void main(String[] args) {
        int[] array = {1,2,-3};
        int[] cube = Cube(array);
        for(int i =0; i<cube.length;i++){
            System.out.println(cube[i]);
        }
    }
    public static int[] Cube(int[] array){
        int[] cube = Arrays.stream(array).map(j -> j * j * j).toArray();
        return cube;
    }
}
