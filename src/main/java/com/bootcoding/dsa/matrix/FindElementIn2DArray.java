package com.bootcoding.dsa.matrix;

public class FindElementIn2DArray {
    public static void main(String[] args) {
        int[][] arr ;
//                new int[1][2];
        arr[0][0] = 1; arr[0][1] = 3;
        arr[0][2] = 2;
        arr[1][0] = 4; arr[1][1] = 5; arr[1][2] = 6;
        arr[2][0] = 7; arr[2][1] = 8; arr[2][2] = 9;
        findElement(arr,1);
    }
    private static void findElement(int[][] arr,int val) {
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <c; j++) {
                if (val == arr[i][j]){
                    System.out.println("Element " + arr[i][j] + " found " + i+" , "+j );
                }
            }
        }
    }
}
