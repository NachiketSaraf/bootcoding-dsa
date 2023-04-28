package com.bootcoding.dsa.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] s = sortBubble(new int[]{50,17,19,14,5});
        for(int i = 0; i < s.length;i++){
            System.out.println(s[i]);
        }
    }
    private static int[] sortBubble(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length-1; j++) {
                if (num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        return num;
    }
}
