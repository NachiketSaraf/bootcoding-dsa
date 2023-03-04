package com.bootcoding.dsa.array;

public class AppearTwice {
    public static void main(String[] args) {
        int[] a = {10,15,20,25,35};
        System.out.println(checkDuplicate(a));
    }

    private static boolean checkDuplicate(int[] a) {
        int c =0;
        for (int i = 0; i< a.length;i++){
            c =0;
            for (int j = i; j<a.length;j++){
                if (a[i]==a[j]){
                    c++;
                }
                if (c>=2) return true;
            }
        }
        return false;
    }
}
