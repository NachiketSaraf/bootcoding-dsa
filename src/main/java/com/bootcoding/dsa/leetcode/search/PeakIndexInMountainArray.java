package com.bootcoding.dsa.leetcode.search;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
      int[] arr = {0,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;
        return binarySearch( arr, max, maxIndex , 0, arr.length-1);

    }
    private static int binarySearch(int[] array,int max,int maxIndex,int left,int right ){
        int mid = (left+right)/2;
        if(max==array[mid]){
            return maxIndex;
        }
        if(left>=right){
            return -1;
        }
        if (max > array[mid]){
            return binarySearch(array,max,maxIndex,mid+1,right);
        }
        else {
            return binarySearch(array,max,maxIndex,left,mid-1);
        }
    }
}
