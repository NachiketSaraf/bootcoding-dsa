package com.bootcoding.dsa.leetcode.matrix;

public class ImageSmoother {
    public static void main(String[] args) {
        int[][] img = new int[3][3];
        img[0][0] =100;img[0][1] =200;img[0][2] =100;
        img[1][0] =200;img[1][1] =50;img[1][2] =200;
        img[2][0] =100;img[2][1] =200;img[2][2] =100;
    }
    private static final int[][] directions = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1}, {0, 0}, {0, 1},
            {1, -1}, {1, 0}, {1, 1}
    };

    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                int count = 0;
                for (int[] direction : directions) {
                    int i_ = i + direction[0];
                    int j_ = j + direction[1];

                    if (0 <= i_ && i_ < m && 0 <= j_ && j_ < n) {
                        sum += img[i_][j_];
                        count += 1;
                    }
                }

                result[i][j] = sum / count;
            }
        }

        return result;
    }
}
