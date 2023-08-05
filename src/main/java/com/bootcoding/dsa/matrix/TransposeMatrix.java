package com.bootcoding.dsa.matrix;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 1; arr[0][1] = 4; arr[0][2] = 7;
        arr[1][0] = 2; arr[1][1] = 5; arr[1][2] = 8;
        arr[2][0] = 3; arr[2][1] = 6; arr[2][2] = 9;

       transpose(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    private static void transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = i; j < col ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] =temp;
            }
        }


    }
}
