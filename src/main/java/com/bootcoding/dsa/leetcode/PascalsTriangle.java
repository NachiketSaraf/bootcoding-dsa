package com.bootcoding.dsa.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 5;
       List<List<Integer>> a = generate(numRows);
       for (int i=0 ; i< a.size();i++){
           System.out.println(a.get(i));
       }
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> row,prev=null;
        for(int i=0;i<numRows;i++)
        {
            row=new ArrayList<Integer>();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                {
                    row.add(1);
                }
                else
                {
                    row.add(prev.get(j-1)+prev.get(j));
                }
            }
            prev=row;
            res.add(row);
        }
        return res;
    }
}
