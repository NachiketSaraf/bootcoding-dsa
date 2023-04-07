package com.bootcoding.dsa.leetcode.stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String[] test = {"([}}])", "()","()[]{}","(]"};
        String s ="([}}])";
        for (int i = 0;i<test.length;i++) {
            System.out.println(isValid(test[i]));
        }
    }
    public static boolean isValid(String s) {
        if (s.length()%2!=0) return false;

        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c=='(' || c=='{' || c=='['){
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek()=='(' ) {
                stack.pop();
            } else if ( c == '}' && !stack.isEmpty() && stack.peek()=='{') {
                stack.pop();
            } else if ( c == ']' && !stack.isEmpty() && stack.peek()=='[' ) {
                stack.pop();
            }else{
                return false; //when cases like }}, )), ([}}]) this will return false
            }
        }
        return stack.isEmpty();
    }
}
