package com.bootcoding.dsa.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers= {50,17,19,14,5};
        int[] s = sortBubble(numbers);
        for(int i = 0; i < s.length;i++){
            System.out.println(s[i]);
        }
    }

    private static int[] sortBubble(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length-1; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }
}
