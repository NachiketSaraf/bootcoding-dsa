package com.bootcoding.dsa.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        List<String> elements = fizzBuzz(10);
        for (String element : elements) System.out.println(element);
    }
    public static List<String> fizzBuzz(int n) {

        List<String> ans = new ArrayList<>();

        for (int num = 1; num <= n; num++) {

            boolean divisibleBy3 = (num % 3 == 0);
            boolean divisibleBy5 = (num % 5 == 0);

            if (divisibleBy3 && divisibleBy5) ans.add("FizzBuzz");
            else if (divisibleBy3) ans.add("Fizz");
            else if (divisibleBy5) ans.add("Buzz");
            else {
                ans.add(Integer.toString(num));
            }
        }

        return ans;
    }

}
