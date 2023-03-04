package com.bootcoding.dsa.array;

public class SumOfSubArray {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        createAllSubArray(a);
        totalSubArraySum(a);
    }

    private static void createAllSubArray(int[] arr) {
        // For creating the sub array
        for (int start =0 ; start<arr.length; start++){
            for (int end = start; end<arr.length; end++){
                printEverySubArray(arr,start,end); // To print every sub array
                calculatingEverySubArraySum(arr,start,end); // To calculate every sub array sum
            }
        }

    }
    public static void printEverySubArray(int[] arr, int s, int e){

        // For printing every sub array
        System.out.print("{");
        for (int i = s; i<=e ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("}");

    }
    public static void calculatingEverySubArraySum(int[] arr,int s, int e){
        int result = 0;
        // calculating every sub array sum
        for (int j = s; j <= e; j++) {
            result += arr[j];
        }
        System.out.println(result);
    }
    public static void totalSubArraySum(int[] arr){
        int result = 0, temp = 0;

        for (int i = 0; i < arr.length; i++) {
            temp = 0;
            for (int j = i; j < arr.length; j++) {
                temp += arr[j];
                result += temp;
            }
        }
        System.out.println();
        System.out.println("total sub array sum = " + result);
    }
}

