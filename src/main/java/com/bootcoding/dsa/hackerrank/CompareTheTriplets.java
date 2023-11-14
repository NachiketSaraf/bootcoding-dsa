package com.bootcoding.dsa.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CompareTheTriplets {
    public static void main(String[] args) {

    }
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {


        List<Integer> ans = new ArrayList<>();

        int aa = 0;
        int bb = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) >b.get(i))  aa++;
            else if (b.get(i)>a.get(i)) bb++;

        }
        ans.add(aa);
        ans.add(bb);

        return ans;
    }
}
