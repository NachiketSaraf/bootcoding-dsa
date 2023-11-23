package com.bootcoding.dsa.leetcode.stack;

import java.util.Stack;

public class RemoveOuterParentheses {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
    public static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder =new StringBuilder();
        for (int i= 0; i<s.length();i++){

            if (s.charAt(i) =='('){
                if (stack.size()>0){
                    stringBuilder.append(s.charAt(i));
                }
                    stack.push(s.charAt(i));
            }else {
                stack.pop();
                if (stack.size()>0){
                    stringBuilder.append(s.charAt(i));
                }
            }
        }
        return stringBuilder.toString();
    }
}
