package com.bootcoding.dsa.matrix;

public class Replace0By1 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1; matrix[0][1] = 2; matrix[0][2] = 0;
        matrix[1][0] = 0; matrix[1][1] = 5; matrix[1][2] = 6;
        matrix[2][0] = 7; matrix[2][1] = 0; matrix[2][2] = 9;

        replace(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void replace(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 0){
                    matrix[i][j] = 1;
                }
            }
        }
    }
}


// transfose matrix of m x n
// wap to print max ele in matrix
// wap to find max sum of sub array
// wap to max sum
