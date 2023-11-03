package com.bootcoding.dsa.leetcode.array.medium;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations {
    public static void main(String[] args) {
        int[] target = {1,3};
        int n = 3;
        List<String> ans = buildArray(target,n);
        //print array using stream
        ans.stream().forEach(System.out::println);
    }
    public static List<String> buildArray(int[] target, int n) {
        int stream = 1;
        int i = 0;
        List<String> ans = new ArrayList<>();

        while(i < target.length && stream <= n){
            ans.add("Push");
            if(stream == target[i]){
                i++;
            }else{
                ans.add("Pop");
            }
            stream++;
        }
        return ans;
    }
}
