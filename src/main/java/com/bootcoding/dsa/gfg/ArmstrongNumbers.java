package com.bootcoding.dsa.gfg;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println(armstrongNumber(123));
    }
    public static String armstrongNumber(int n){
        int rem = 0;
        int sum = 0;
        int temp = n;
        while(n != 0)
        {
            int div = n/10;
            rem = n%10;
            sum = sum + (rem*rem*rem );
            n = div;
        }
        if ( sum == temp)
        {
            return  "Amstrong";
        }
        else
        {
            return  "Not Amstrong";
        }
    }
}
