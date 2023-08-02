package com.bootcoding.dsa.matrix;

public class SparseMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1; matrix[0][1] = 2; matrix[0][2] = 0;
        matrix[1][0] = 0; matrix[1][1] = 0; matrix[1][2] = 6;
        matrix[2][0] = 7; matrix[2][1] = 0; matrix[2][2] = 0;

        checkSparse(matrix);
    }

    private static void checkSparse(int[][] matrix) {
        int countOf0 = 0;
        int countOfNon0 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if ( matrix[i][j] == 0) countOf0++;
                else countOfNon0++;

            }
        }
        if (countOf0 > countOfNon0) System.out.println("its a sparse matrix");
        else System.out.println("Not a sparse matrix");
    }
}
