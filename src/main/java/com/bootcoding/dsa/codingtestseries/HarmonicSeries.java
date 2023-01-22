package com.bootcoding.dsa.codingtestseries;

public class HarmonicSeries {
    public static void main(String[] args) {
        int n = 5;
        float sum = sumOfSeries(n);
        System.out.println(sum);
    }
    public static float sumOfSeries(int n){
        float sum = 0 ;
        for (float i = 1; i <=n;i++){
            sum= sum +(1/i);
        }
        return sum;
    }
}
