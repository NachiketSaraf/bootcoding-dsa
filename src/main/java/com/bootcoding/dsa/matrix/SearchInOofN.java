package com.bootcoding.dsa.matrix;

public class SearchInOofN {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 3;
        matrix[0][2] = 4;
        matrix[1][0] = 5;
        matrix[1][1] = 6;
        matrix[1][2] = 9;
        matrix[2][0] = 3;
        matrix[2][1] = 7;
        matrix[2][2] = 8;

        int[] ans= search(matrix,8);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }

    private static int[] search(int[][] matrix, int val) {
        int[] inx = new int[2];
        int i = 0;
        int j = 0;
        while (j < matrix.length) {
            if (matrix[i][j] == val) {
                inx[0] = i;
                inx[1] = j;
                return inx;
            }
            else if (matrix[j][i] == val) {
                inx[0] = j;
                inx[1] = i;
                return inx;
            }
            i++;
            if (i == matrix.length - 1) {
                j++;
                i = 0;
            }
        }
        return inx;
    }
}
