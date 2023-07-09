package com.bootcoding.dsa.recursion;

import com.bootcoding.dsa.leetcode.recursion.Fibonacci;

import java.util.HashMap;

public class Fib {
    public static void main(String[] args) {
            Fib f = new Fib();
            System.out.println(f.fib(6015));
        }
        HashMap<Long,Long> map = new HashMap<>();
        public long fib(long n){
            if(n==0) {
                return 0;
            }
            if (n==1){
                return 1;
            }
            if (map.containsKey(n)){
                return map.get(n);
            }
            map.put(n,fib(n-1) + fib(n-2));
            return map.get(n);
        }

    }


