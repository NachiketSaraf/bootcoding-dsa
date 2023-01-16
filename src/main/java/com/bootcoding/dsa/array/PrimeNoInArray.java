package com.bootcoding.dsa.array;

public class PrimeNoInArray {
    public static void main(String[] args) {
        int[] num = {1,2, 7, 3, 15};

        System.out.println("Array");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        findPrimeElements(num);

    }

    private static void findPrimeElements(int[] num) {
        int[] a = num;
        for (int i =0;i<num.length;i++){
            if (num[i]==2 || num[i] == 3){
                System.out.println(num[i]+" is Prime");
            }else if (num[i]%2==0){

            }else if (num[i]%3==0){

            }else {
                System.out.println(num[i]+" is Prime");
            }
        }
    }
}
