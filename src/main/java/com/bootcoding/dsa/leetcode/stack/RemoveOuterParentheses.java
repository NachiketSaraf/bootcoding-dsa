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
                if (st.size()>0){
                    stringBuilder.append(s.charAt(i));
                }
                    st.push(s.charAt(i));
            }else {
                st.pop();
                if (st.size()>0){
                    stringBuilder.append(s.charAt(i));
                }
            }
        }
        return stringBuilder.toString();
    }
}
