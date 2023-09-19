package com.bootcoding.dsa.m;

import java.util.ArrayList;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws java.lang.Exception {
        //Scanner sc = new Scanner(System.in);

        // Call a function to perform the Camel Case conversion
        convertCamelCaseToWords("saveThePackage");
    }

    public static void convertCamelCaseToWords(String s) {

        int count = 0;
        for (char n : s.toCharArray()) {
            if (Character.isUpperCase(n)) count++;
        }
        String[] ans = new String[count+1];

        for (int i = 0; i < s.length(); i++) {
            StringBuilder currentWord = new StringBuilder();
            char n = s.charAt(i);
            while (!Character.isUpperCase(i+1)) {
                currentWord.append(s.charAt(i));
            }
            currentWord.append(s.charAt(i));
            System.out.println(currentWord);
            ans[i] = currentWord.toString();
        }
    }


}
//currentWord = new StringBuilder();


//            if (Character.isLowerCase(s.charAt(i)) && Character.isLowerCase(s.charAt(i + 1)) && i + 1 < s.length()) {
//                currentWord.append(Character.toUpperCase(s.charAt(i)));
//                currentWord.append(Character.toUpperCase(s.charAt(i+1)));
//            }
//            if (!Character.isLowerCase(s.charAt(i)) && Character.isLowerCase(s.charAt(i + 1)) && i + 1 < s.length()) {
//                currentWord.append(Character.toLowerCase(s.charAt(i)));
//            } else {
//                currentWord.append(Character.toLowerCase(s.charAt(i)));
//                System.out.println(currentWord.toString());
//
//            }
//            currentWord =new StringBuilder();


//        if (currentWord.length() > 0) {
//            System.out.println(currentWord.toString());
//        }