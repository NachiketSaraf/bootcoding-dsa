package com.bootcoding.dsa.string;

public class SeperateYearMonthDay {
    public static void main(String[] args) {
        doTask("2023-04-15");

    }
    public static void doTask(String date){
        String[] split = date.split("-");
        String year = split[0];
        String month = split[1];
        String day = split[3];
        System.out.println("Year"+year);
        System.out.println("Month"+month);
        System.out.println("Day"+day);

    }
}
