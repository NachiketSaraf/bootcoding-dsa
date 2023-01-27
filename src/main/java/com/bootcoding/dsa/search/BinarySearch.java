package com.bootcoding.dsa.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,6,};
        int x = 6;
        int index = binarySearch(array,x,0,array.length);
        System.out.println(index);
    }
    private static int binarySearch(int[] array, int x,int left,int right ){
        int mid = (left+right)/2;
        if(x==array[mid]){
            return mid;
        }
        if(left>=right){
            return -1;
        }
        if (x>array[mid]){
            return binarySearch(array,x,mid+1,right);
        }
        else {
            return binarySearch(array,x,left,mid-1);
        }
    }
}
