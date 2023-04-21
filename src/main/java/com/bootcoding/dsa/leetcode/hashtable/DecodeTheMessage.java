package com.bootcoding.dsa.leetcode.hashtable;


import java.util.HashMap;

public class DecodeTheMessage {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        System.out.println(decodeMessage(key,message));
    }
    public static String decodeMessage(String key, String message) {
        StringBuilder sb = new StringBuilder();
        key = key.replace(" " , "");
        HashMap<Character,Character> code = new HashMap<>();
        char original = 'a';
        for (int i = 0; i < key.length(); i++) {
            if (!code.containsKey(key.charAt(i))) {
                code.put(key.charAt(i), original++);
            }
        }
        for (int i =0 ; i<message.length();i++) {
            if (code.containsKey(message.charAt(i))){
                sb.append(code.get(message.charAt(i)));
            }
            else {
                sb.append(message.charAt(i));
            }
        }
        return sb.toString();
    }
}
