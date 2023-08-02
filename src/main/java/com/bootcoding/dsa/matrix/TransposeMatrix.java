package com.bootcoding.dsa.matrix;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 1; arr[0][1] = 2; arr[0][2] = 3;
        arr[1][0] = 4; arr[1][1] = 5; arr[1][2] = 6;
        arr[2][0] = 7; arr[2][1] = 8; arr[2][2] = 9;
        System.out.println(arr.length);
       int[][] matrix =  transpose(arr);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] transpose(int[][] matrix) {
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
