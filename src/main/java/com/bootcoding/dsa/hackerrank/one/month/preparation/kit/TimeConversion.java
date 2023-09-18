package com.bootcoding.dsa.hackerrank.one.month.preparation.kit;

public class TimeConversion {
    public static void main(String[] args) {
        String s ="07:05:45PM";
        System.out.println(timeConversion(s));
    }
    public static String timeConversion(String s) {
        // Write your code here
        if (s.substring(0,2).equals("12") && s.contains("AM")){
            s = "00"+s.substring(2,s.length());
        }

        if ( !s.substring(0,2).equals("12") && s.contains("PM")){
            s = ( Integer.parseInt(s.substring(0,2)) + 12) + s.substring(2,s.length());
        }
        return s.substring(0,s.length()-2);
    }
}
