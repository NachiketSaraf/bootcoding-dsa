package com.bootcoding.dsa.recursion;

public class OddNoInAscending {
    public static void main(String[] args) {
        print(10);
    }
    public static void print(int n){
        if(n==0) return;
        print(n-1);
        if (n%2!=0){
            System.out.println(n);
        }
    }
}
