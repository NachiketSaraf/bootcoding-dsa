package com.bootcoding.dsa.array;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {2,10,12,1,11};
        int[] ans = checkNextGreaterElement(arr);
        for (int i =0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }

    private static int[] checkNextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack();

        for (int i = 2*n-1; i >0 ; i--){
            while ((stack.isEmpty() == false) && stack.peek() <= arr[i % n]){
                stack.pop();
            }
            if(i<n){
                if(stack.isEmpty()==false){
                    nge[i] = stack.peek();
                }else
                    nge[i]= -1;
            }
            stack.push(arr[i%n]);
        }
        return arr;
    }
}
