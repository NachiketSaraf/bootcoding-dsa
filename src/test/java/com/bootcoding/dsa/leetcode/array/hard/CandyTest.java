package com.bootcoding.dsa.leetcode.array.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandyTest {
    @Test
    public void candyTest(){
        Candy c = new Candy();
        int[][] test = {{1,2,6,5,4,3,1},{1,3,2,6,4,9,2,1},{1,0,2}};

        int[] result = {    18         ,        13       ,   5};

//        int[] arr = {1,2,6,5,4,3,1};
//        int[] arr1 = {1,3,2,6,4,9,2,1};
//        int[] arr2 ={1,0,2};
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[0].length; j++) {
                //int[] arr = new int[]{test[i][j]};
                int output = c.candy(new int[]{test[i][j]});
                int expected = result[i];
                assertEquals(output,expected);
            }
        }


    }

}