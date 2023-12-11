package com.bootcoding.dsa.leetcode.matrix;

public class TransposeMatrix {
    public static void main(String[] args) {

    }
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int [][] arr = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = matrix[j][i];

            }
        }
        return arr;
    }
}
