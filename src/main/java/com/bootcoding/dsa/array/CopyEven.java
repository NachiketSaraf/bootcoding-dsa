package com.bootcoding.dsa.array;

public class CopyEven {
    public static void main(String[] args) {
        int[] arr = {14,35,66,75,92,3,5,8,7,9};
        int[] res = copyEvenInNewArray(arr);
        for (int i = 0; i< res.length;i++){
            System.out.println(res[i]);
        }

    }

    private static int[] copyEvenInNewArray(int[] arr) {
        int c =0;
        for (int i =0;i<arr.length;i++){
            if (arr[i]%2==0){
                c++;
            }
        }
        int[] res = new int[c];
        int index= 0;
        for (int i=0;i< arr.length ;i++){
            if(arr[i]%2==0){
                res[index] = arr[i];
                index++;
            }
        }
        return res;
    }
}
