package com.bootcoding.dsa.matrix;

import java.util.Arrays;

public class SortMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1; matrix[0][1] = 4; matrix[0][2] = 3;
        matrix[1][0] = 9; matrix[1][1] = 5; matrix[1][2] = 2;
        matrix[2][0] = 7; matrix[2][1] = 6; matrix[2][2] = 8;

        sort(matrix);
    }

    private static void sort(int[][] matrix) {
        Arrays.sort(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
