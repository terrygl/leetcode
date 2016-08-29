package com.leetcode;

/**
 * Created by geliang on 16/8/8.
 */
public class ReversString {
    public String reverseString(String s) {
        int  length =s.length();
        char[] output = new char[length];
        output = s.toCharArray();
        char tmpChar =1;
        for(int i =0 ;i< length/2;i++){
            tmpChar = output[i];
            output[i]=output[length-1-i];
            output[length-i-1]=tmpChar;
        }
        return new String(output);
    }
}
