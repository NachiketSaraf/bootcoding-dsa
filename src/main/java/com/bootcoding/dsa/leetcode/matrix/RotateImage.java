package com.bootcoding.dsa.leetcode.matrix;

import java.util.HashMap;

public class RotateImage {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        rotate(matrix,hashMap);
    }
    public static void rotate(int[][] matrix, int hashmap) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = i; j < col ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] =temp;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < (col/2); j++) {
                int temp = matrix[i][j] ;
                matrix[i][j] = matrix[i][col-j-1] ;
                matrix[i][col-j-1] = temp;
            }

        }


    }
}
