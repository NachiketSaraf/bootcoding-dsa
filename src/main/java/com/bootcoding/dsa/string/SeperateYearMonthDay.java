package com.bootcoding.dsa.string;

import static java.lang.System.*;

public class SeperateYearMonthDay {
    public static void main(String[] args) {
        doTask("2023-04-15");
    }
    public static void doTask(String date){
        String[] split = date.split("-");
        String year = split[0];
        String month = split[1];
        String day = split[2];
        out.println("Year "+year);
        out.println("Month "+month);
        out.println("Day "+day);
    }
}
