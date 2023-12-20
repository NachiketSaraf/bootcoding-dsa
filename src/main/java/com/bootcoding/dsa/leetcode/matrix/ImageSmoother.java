package com.bootcoding.dsa.leetcode.matrix;

public class ImageSmoother {
    public static void main(String[] args) {
        int[][] image = new int[3][3];
        image[0][0] =100;image[0][1] =200;image[0][2] =100;
        image[1][0] =200;image[1][1] =50;image[1][2] =200;
        image[2][0] =100;image[2][1] =200;image[2][2] =100;
        int[][] img = imageSmoother(image);
        for (int[] i:img) {
            for (int n:i) {
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
    private static final int[][] directions = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1}, {0, 0}, {0, 1},
            {1, -1}, {1, 0}, {1, 1}
    };

    public static int[][] imageSmoother(int[][] image) {
        int m = image.length;
        int n = image[0].length;

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                int count = 0;
                for (int[] direction : directions) {
                    int i_ = i + direction[0];
                    int j_ = j + direction[1];

                    if (0 <= i_ && i_ < m && 0 <= j_ && j_ < n) {
                        sum += image[i_][j_];
                        count += 1;
                    }
                }

                result[i][j] = sum / count;
            }
        }

        return result;
    }
}
