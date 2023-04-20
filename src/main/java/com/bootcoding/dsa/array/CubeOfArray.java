package com.bootcoding.dsa.array;

import java.util.Arrays;

public class CubeOfArray {
    public static void main(String[] args) {
        int[] array = {1,2,-3};
        int[] cube = Cube(array);
        for (int j : cube) System.out.println(j);
    }
    public static int[] Cube(int[] array){

        int[] array1 = Arrays.stream(array).map(j -> j * j * j).toArray();
        return array1;

    }
}
