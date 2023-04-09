package com.bootcoding.dsa.array;

public class PalindromeArray {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(
                new int[]{11,2,2,1,1}));
    }
    public static String checkPalindrome(int[] arr){
        int m = arr.length-1;
        for (int i =0 ; i< arr.length/2;i++){
            if (arr[i]!=arr[m]){
                return "Array is not palindrome";
            }
            m--;
        }
        return "Array is palindrome";
    }
}
