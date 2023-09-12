package com.bootcoding.dsa.leetcode.string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDeletionsToMakeCharacterFrequenciesUniqueTest {
    @Test
    public void multiStringTest(){
        String[] testCases = {"aab","aaabbbcc","ceabaacb"};
        int[] testResult = {0,2,2};

        MinimumDeletionsToMakeCharacterFrequenciesUnique deleteChar = new MinimumDeletionsToMakeCharacterFrequenciesUnique();
        for (int i = 0; i < testCases.length; i++) {
            int output = deleteChar.minDeletions(testCases[i]);
            int expected = testResult[i];
            assertEquals(output,expected);
        }

    }

}