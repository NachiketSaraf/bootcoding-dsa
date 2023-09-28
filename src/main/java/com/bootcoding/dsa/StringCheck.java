package com.bootcoding.dsa;

public class StringCheck {
    public static void main(String[] args) {
//        System.out.println(solution("AGTCTCTATAAAG" ));
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            System.out.println(solve(i));
        }

    }
        public static String solution(String s) {
            int countA = 0;
            int countT = 0;

            for (int i = 0; i < s.length(); i++) {
                char currentChar = s.charAt(i);
                if (currentChar == 'A') {
                    countA++;
                } else if (currentChar == 'T') {
                    countT++;
                }
            }

            if (countA < countT) {
                return "YES";
            } else {
                return "NO";
            }
        }

        public static int solve(int n) {
            System.out.println(n);
            // Find the nearest perfect square less than or equal to nw
            int nearestPerfectSquare = (int) Math.sqrt(n);

            // Calculate the absolute difference
            int absoluteDifference = Math.abs(n - nearestPerfectSquare * nearestPerfectSquare);

            return absoluteDifference;
        }




}
