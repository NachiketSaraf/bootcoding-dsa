package com.bootcoding.dsa.string;

public class BinaryToDec {
    public static void main(String[] args) {
        String bit="11001";
        int a = 1;
        int sum = 0;
        for (int i = bit.length()-1; i>=0;i--){
            if (bit.charAt(i)== '1'){
                sum += a;
            }
            a = a*2;
        }

        System.out.println(sum);
    }
}
