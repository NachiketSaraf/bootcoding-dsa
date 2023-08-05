package com.bootcoding.dsa.matrix;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1; matrix[0][1] = 1; matrix[0][2] = 0;
        matrix[1][0] = 1; matrix[1][1] = 0; matrix[1][2] = 1;
        matrix[2][0] = 0; matrix[2][1] = 0; matrix[2][2] = 0;
        int image[][] = flipAndInvertImage(matrix);

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                System.out.print(image[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < (col+1/2); j++) {
                int temp = image[i][j] ^1;
                image[i][j] = image[i][col-j-1] ^1;
                image[i][col-j-1] = temp;
            }
        }
        return image;
    }
}
