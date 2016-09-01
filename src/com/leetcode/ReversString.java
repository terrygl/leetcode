package com.leetcode;

/**
 * Created by geliang on 16/8/8.
 */
public class ReversString {
    public String reverseString(String s) {
//        first is good 59%
//        int  length =s.length();
//        char[] output = new char[length];
//        output = s.toCharArray();
//        char tmpChar =1;
//        for(int i =0 ;i< length/2;i++){
//            tmpChar = output[i];
//            output[i]=output[length-1-i];
//            output[length-i-1]=tmpChar;
//        }
//        return new String(output);
//        second is not good 37%
//        int  length =s.length();
//        char[] output = new char[length];
//        int cursor =0;
//        for(int i=length-1;i>=0l;i--){
//            output[cursor++]=s.charAt(i);
//        }
//        return String.valueOf(output);
//        if(s == null || s.length() == 0)
//            return "";
//        最优的算法 90.7% 创建数组有时间消耗，能省则省
        int j=s.length()-1;
        int i=0;
        char[] output =s.toCharArray();
        char tmpChar =1;
        while(i<j){
            tmpChar = output[i];
            output[i] = output[j];
            output[j] = tmpChar;
            i++;
            j--;
        }
        return new String(output);
    }
}
