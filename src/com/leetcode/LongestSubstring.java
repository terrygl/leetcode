package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by geliang on 16/8/29.
 */
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.equals("") ) return 0;
//        查找所有不重复的字符串
        ArrayList arrayListChar = new ArrayList();
        Map<String,Integer>  mapString = new HashMap<String, Integer>();
        int maxlength = 1;
//        int removeStart = 0;
        arrayListChar.add(s.charAt(0));
        int i = 0;
        int j = 1;
        int len = s.length();
        for(;i<len;i++){
//            for( j=i+maxlength;j<s.length();j++) {
            for( ;j<len;j++) {
//                判断重复的字符
                if(arrayListChar.contains(s.charAt(j))){
                    maxlength=arrayListChar.size()>maxlength?arrayListChar.size():maxlength;
                    //初始化arrayListChar ,截取重复字符位置后的字符串
                    int removeStart = arrayListChar.indexOf(s.charAt(j));
                    int z =0;
                    while(z++<=removeStart){
                        arrayListChar.remove(0);
                    }
//                    初始化下一个数组
                    arrayListChar.add(s.charAt(j));
                    i= i+removeStart;
                    j++;
                    break;
                }else{
                    arrayListChar.add(s.charAt(j));
                }
            }
//            i=j;
        }
        return arrayListChar.size()>maxlength?arrayListChar.size():maxlength;
    }


}
