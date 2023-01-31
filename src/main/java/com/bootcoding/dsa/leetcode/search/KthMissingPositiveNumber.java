package com.bootcoding.dsa.leetcode.search;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(findKthPositive(arr, 1));
    }

    public static int findKthPositive(int[] arr, int k) {
        int misPos = 1;
        int i = 0;
        while (true) {
            if (misPos == arr[i]) {
                i++;

            } else {

                --k;
                if(k == 0){
                    return misPos;
                }
            }

            misPos++;
            if(i == arr.length){
                --i;
            }

        }

    }


 /*
        misPos = 1;
        k = 3;
        search for misPos in array
            if not found
            k-- ;
            misPos++ ;
            else
            misPos++ ;
            if k == 0 ;
            return misPos;
         */


//     return binarySearch(arr,k,1,0,arr.length-1);
//    public static int binarySearch(int a[] ,int x ,int i,int left, int right){
//        int mid = (left + right) /2;
//        if(i == a[mid]){
//            return binarySearch(a,x ,++i,0 ,right);
//        }
//        if(x == 0){
//            return i;
//        }
//        if(left >= right){
//            return binarySearch(a,--x ,++i,0 ,a.length-1);
//        }
//        if(i>a[mid]){
//            return binarySearch(a,x ,i,mid+1 ,right);
//        }else{
//            return binarySearch(a,x ,i,left ,mid-1);
//        }
//    }

}
