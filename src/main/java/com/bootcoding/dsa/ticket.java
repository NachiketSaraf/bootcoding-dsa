package com.bootcoding.dsa;

public class ticket {
    public static void main(String[] args) {
        System.out.println(checkLuck(123124));
    }

    public static boolean checkLuck(int n) {
        int count = 0;
        int d = n;
        while (d != 0) {
            count++;
            d = d / 10;
        }
        int firstSum = 0;
        int lastSum = 0;
        if (count % 2 == 0) {
            d = n;
            int c = count;
            while (d != 0) {
                if (count > c / 2) {
                    firstSum += d % 10;
                } else {
                    lastSum += d % 10;
                }
                d = d / 10;
                count--;

            }
        } else return false;

        return firstSum == lastSum;
    }
}
