package com.bootcoding.dsa.array;

import java.util.Arrays;

public class CubeOfArray {
    public static void main(String[] args) {
        int[] cube = Cube(new int[]{1,2,-3});

        for (int j : cube) System.out.println(j);
    }
    public static int[] Cube(int[] array){

        return Arrays.stream(array).map(j -> j * j * j).toArray();

    }
}
